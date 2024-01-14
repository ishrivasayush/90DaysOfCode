package com.narainox.BlogsAppBackend.repository;

import com.narainox.BlogsAppBackend.model.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends MongoRepository<Blog,String> {
    List<Blog> findByUser(String userId, Pageable pageable);
    Blog deleteByBlogId(String blogId);
    Blog findByBlogId(String blogId);

}
