package zw.org.mohcc.hiv.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.org.mohcc.hiv.model.Role;
import zw.org.mohcc.hiv.enums.ERole;
import zw.org.mohcc.hiv.repository.RoleRepository;

import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role getRoleByName(ERole roleName) {
        return roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
    }

    @PostConstruct
    public void initRoles(){
        if(roleRepository.findByName(ERole.ROLE_ADMIN).isEmpty()){
            roleRepository.save(getRoleByName(ERole.ROLE_ADMIN));
        }
        if(roleRepository.findByName(ERole.ROLE_USER).isEmpty()){
            roleRepository.save(getRoleByName(ERole.ROLE_USER));
        }
    }
}
