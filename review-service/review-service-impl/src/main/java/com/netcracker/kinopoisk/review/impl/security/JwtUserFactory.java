package com.netcracker.kinopoisk.review.impl.security;

import com.netcracker.kinopoisk.review.model.Role;
import com.netcracker.kinopoisk.review.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {
	public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getEmail(),
                user.getPasswordHash(),
                mapToGrantedAuthorities(user.getRole())
        );
        
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(Role userRole) {
    	List<GrantedAuthority> ga = new ArrayList<>(1);
    	ga.add(new SimpleGrantedAuthority(userRole.getRole()));
        return ga;
    }
}
