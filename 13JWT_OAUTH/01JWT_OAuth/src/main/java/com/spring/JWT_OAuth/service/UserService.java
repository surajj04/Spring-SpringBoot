package com.spring.JWT_OAuth.service;

import com.spring.JWT_OAuth.model.User;
import com.spring.JWT_OAuth.repository.UserRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepositroy repo;


    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);


    public User userRegister(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
