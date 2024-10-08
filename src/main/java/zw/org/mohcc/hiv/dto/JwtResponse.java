package zw.org.mohcc.hiv.dto;

import java.util.Set;

public class JwtResponse {
    private String token;
    private Set<String> roles;

    public JwtResponse(String token, Set<String> roles) {
        this.token = token;
        this.roles = roles;
    }

    // Getters
    public String getToken() {
        return token;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
