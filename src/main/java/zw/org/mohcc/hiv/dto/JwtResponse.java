package zw.org.mohcc.hiv.dto;

import lombok.Getter;

import java.util.Set;

@Getter
public class JwtResponse {
    private final String token;
    private final Set<String> roles;

    public JwtResponse(String token, Set<String> roles) {
        this.token = token;
        this.roles = roles;
    }

}
