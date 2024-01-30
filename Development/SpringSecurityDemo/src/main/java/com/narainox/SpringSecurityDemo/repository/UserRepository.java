package com.narainox.SpringSecurityDemo.repository;

import com.narainox.SpringSecurityDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsernameOrEmail(String username, String email);

}
