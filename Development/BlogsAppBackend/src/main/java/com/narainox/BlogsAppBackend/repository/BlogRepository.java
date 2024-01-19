package com.narainox.BlogsAppBackend.repository;

import com.narainox.BlogsAppBackend.model.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
    List<Blog> findByUser(String userId, Pageable pageable);
    Blog deleteByBlogId(String blogId);
    Blog findByBlogId(String blogId);

}
