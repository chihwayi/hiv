package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import zw.org.mohcc.hiv.dto.JwtResponse;
import zw.org.mohcc.hiv.dto.LoginRequest;
import zw.org.mohcc.hiv.dto.RegisterRequest;
import zw.org.mohcc.hiv.enums.ERole;
import zw.org.mohcc.hiv.model.Role;
import zw.org.mohcc.hiv.model.User;
import zw.org.mohcc.hiv.repository.RoleRepository;
import zw.org.mohcc.hiv.repository.UserRepository;
import zw.org.mohcc.hiv.service.JwtTokenProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.service.RoleService;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private final RoleService roleService;

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider,
                          UserRepository userRepository, RoleService roleService, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Authenticate the user
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword()));

        // Set authentication in the security context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Generate JWT token
        String token = jwtTokenProvider.generateToken(authentication);

        // Return the JWT token in the response body
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        // Check if the username is already taken
        if (userRepository.existsByUsername(registerRequest.getUsername())) {
            return ResponseEntity.badRequest().body("Username is already taken");
        }

        // Check if the email is already registered
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            return ResponseEntity.badRequest().body("Email is already registered");
        }

        // Handle roles from the request
        Set<String> strRoles = registerRequest.getRoles();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            // Default role assignment
            Role userRole = roleService.getRoleByName(ERole.ROLE_USER);
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                if (role.equals("admin")) {
                    Role adminRole = roleService.getRoleByName(ERole.ROLE_ADMIN);
                    roles.add(adminRole);
                } else {
                    Role userRole = roleService.getRoleByName(ERole.ROLE_USER);
                    roles.add(userRole);
                }
            });
        }

        // Create a new User object
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setEmail(registerRequest.getEmail());
        user.setRoles(roles);
        user.setEnabled(true);

        // Save the user
        userRepository.save(user);

        return ResponseEntity.ok("User registered successfully");
    }
}
