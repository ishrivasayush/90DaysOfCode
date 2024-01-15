package com.narainox.BlogsAppBackend.service;

import com.narainox.BlogsAppBackend.dto.CommonPaginationRequest;
import com.narainox.BlogsAppBackend.model.Blog;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> getBlogs(CommonPaginationRequest commonPaginationRequest) throws Exception;
    Blog getByBlogId(String blogId) throws Exception;
    Blog deleteBlog(String blogId) throws Exception;
    Blog createBlog(Blog blog) throws Exception;
    Blog updateBlog(Blog blog) throws Exception;
}
