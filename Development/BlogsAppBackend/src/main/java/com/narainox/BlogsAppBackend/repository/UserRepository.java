package com.narainox.BlogsAppBackend.repository;

import com.narainox.BlogsAppBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserNameAndPassword(String userName,String password);
}
