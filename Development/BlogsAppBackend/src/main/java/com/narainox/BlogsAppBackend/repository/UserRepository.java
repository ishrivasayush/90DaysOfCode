package com.narainox.BlogsAppBackend.repository;

import com.narainox.BlogsAppBackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    User findByUserNameAndPassword(String userName,String password);
}
