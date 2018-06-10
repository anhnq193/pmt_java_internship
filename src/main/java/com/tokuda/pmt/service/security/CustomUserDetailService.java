package com.tokuda.pmt.service.security;

import com.tokuda.pmt.entity.AdminEntity;
import com.tokuda.pmt.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service("customUserDetailService")
public class CustomUserDetailService implements UserDetailsService {
    private final AdminRepository adminRepository;

    @Autowired
    public CustomUserDetailService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AdminEntity> optionalAdminEntity = adminRepository.findByUsername(username);
        if(!optionalAdminEntity.isPresent()){
            throw new UsernameNotFoundException("No user present with username: " + username);
        }
        AdminEntity adminEntity = optionalAdminEntity.get();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ADMIN");
        return new User(adminEntity.getUsername(), adminEntity.getPassword(), Arrays.asList(grantedAuthority));
    }
}
