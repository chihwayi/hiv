package zw.org.mohcc.hiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import zw.org.mohcc.hiv.dto.JwtResponse;
import zw.org.mohcc.hiv.dto.LoginRequest;
import zw.org.mohcc.hiv.dto.RegisterRequest;
import zw.org.mohcc.hiv.enums.ERole;
import zw.org.mohcc.hiv.model.Role;
import zw.org.mohcc.hiv.model.User;
import zw.org.mohcc.hiv.repository.UserRepository;
import zw.org.mohcc.hiv.service.JwtTokenProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import zw.org.mohcc.hiv.service.RoleService;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

        // Set authentication in security context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Generate JWT token
        String token = jwtTokenProvider.generateToken(authentication);

        // Extract roles from authentication
        Set<String> roles = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toSet());

        // Add a log statement to check if the token is generated
        System.out.println("Generated JWT Token: " + token);

        // Return the JWT token and roles in the response body
        return ResponseEntity.ok(new JwtResponse(token, roles));
    }

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody RegisterRequest registerRequest) {
        // Check if the username is already taken
        if (userRepository.existsByUsername(registerRequest.getUsername())) {
            return ResponseEntity.badRequest().body(Map.of("message", "Username is already taken"));
        }

        // Check if the email is already registered
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            return ResponseEntity.badRequest().body(Map.of("message", "Email is already registered"));
        }

        // Handle roles from the request
        Set<String> strRoles = registerRequest.getRoles();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null || strRoles.isEmpty()) {
            // Default role assignment
            Role userRole = roleService.getRoleByName(ERole.ROLE_USER);
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                if (role.equals("admin")) {
                    Role adminRole = roleService.getRoleByName(ERole.ROLE_ADMIN);
                    roles.add(adminRole);
                } else {
                    Role defaultRole = roleService.getRoleByName(ERole.ROLE_USER);
                    roles.add(defaultRole);
                }
            });
        }

        // Create and save user
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setEmail(registerRequest.getEmail());
        user.setRoles(roles);
        user.setEnabled(true);
        userRepository.save(user);

        // Return a success response in JSON format
        return ResponseEntity.ok(Map.of("message", "User registered successfully"));
    }

}
