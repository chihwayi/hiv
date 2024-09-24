package zw.org.mohcc.hiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import zw.org.mohcc.hiv.dto.UserPrincipal;
import zw.org.mohcc.hiv.model.User;
import zw.org.mohcc.hiv.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        // Find user by username or email
        User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username or email: " + usernameOrEmail));

        return UserPrincipal.create(user);  // Your UserPrincipal logic
    }
}
