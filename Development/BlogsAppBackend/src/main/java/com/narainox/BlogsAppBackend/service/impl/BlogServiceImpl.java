package com.narainox.BlogsAppBackend.service.impl;

import com.narainox.BlogsAppBackend.dto.CommonPaginationRequest;
import com.narainox.BlogsAppBackend.model.Blog;
import com.narainox.BlogsAppBackend.repository.BlogRepository;
import com.narainox.BlogsAppBackend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl  implements BlogService {

    @Autowired
    private BlogRepository blogRepository;
    public Blog createBlog(Blog blog)throws Exception
    {
        return blogRepository.save(blog);
    }
    public Blog updateBlog(Blog blog)throws Exception
    {
        return blogRepository.save(blog);
    }
    public Blog deleteBlog(String blogId)throws Exception
    {
        return blogRepository.deleteByBlogId(blogId);
    }
    public Blog getByBlogId(String blogId)throws Exception
    {
        return blogRepository.findByBlogId(blogId);
    }
    public List<Blog> getBlogs(CommonPaginationRequest commonPaginationRequest)throws Exception
    {
        Pageable pageable=PageRequest.of(commonPaginationRequest.getPageNo(),
                commonPaginationRequest.getPageSize(),
                Sort.by(commonPaginationRequest.getSortBy()).descending());
        return blogRepository.findByUser(commonPaginationRequest.getValue(),pageable);
    }
}
