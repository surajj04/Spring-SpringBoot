package com.spring.JWT_OAuth.service;

import com.spring.JWT_OAuth.model.User;
import com.spring.JWT_OAuth.model.UserPrinciple;
import com.spring.JWT_OAuth.repository.UserRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    UserRepositroy repositroy;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repositroy.findByUsername(username);
        if (user == null) {
            System.out.println("user 404");
            throw new UsernameNotFoundException("user 404");
        }
        return new UserPrinciple(user);
    }
}
