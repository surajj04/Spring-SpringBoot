package org.bytetech.SpringRestApi.Repositroy;

import org.bytetech.SpringRestApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<org.bytetech.SpringRestApi.model.User,Integer> {
    User findByUsername(String username);
}
