package com.spring.JWT_OAuth.repository;

import com.spring.JWT_OAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositroy extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
