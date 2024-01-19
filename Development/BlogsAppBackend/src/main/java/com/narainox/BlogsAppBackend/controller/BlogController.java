package com.narainox.BlogsAppBackend.controller;

import com.narainox.BlogsAppBackend.dto.CommonPaginationRequest;
import com.narainox.BlogsAppBackend.dto.CreateBlogRequest;
import com.narainox.BlogsAppBackend.dto.DBSResponseEntity;
import com.narainox.BlogsAppBackend.dto.UpdateBlogRequest;
import com.narainox.BlogsAppBackend.model.Blog;
import com.narainox.BlogsAppBackend.service.BlogService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PutMapping("v1/blogs")
    public ResponseEntity<DBSResponseEntity> updateBlogCall(@Valid @RequestBody UpdateBlogRequest updateBlogRequest)
    {
        DBSResponseEntity dbsResponseEntity=new DBSResponseEntity();
        Blog blog=new Blog();

        try {
            BeanUtils.copyProperties(updateBlogRequest,blog);
            Blog blog1 = blogService.updateBlog(blog);
            dbsResponseEntity.setMessage("Blog Updated Successfully.");
            dbsResponseEntity.setData(blog1);
            return ResponseEntity.ok(dbsResponseEntity);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @PostMapping("v1/blogs")
    public ResponseEntity<DBSResponseEntity> createBlogCall(@Valid @RequestBody CreateBlogRequest createBlogRequest)
    {
        DBSResponseEntity dbsResponseEntity=new DBSResponseEntity();
        Blog blog=new Blog();

        try {
            BeanUtils.copyProperties(createBlogRequest,blog);
            Blog blog1 = blogService.createBlog(blog);
            dbsResponseEntity.setMessage("Blog Created Successfully.");
            dbsResponseEntity.setData(blog1);
            return ResponseEntity.ok(dbsResponseEntity);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @DeleteMapping("v1/blogs/{blogId}")
    public ResponseEntity<DBSResponseEntity> deleteBlogCall(@PathVariable String blogId)
    {
        DBSResponseEntity dbsResponseEntity=new DBSResponseEntity();

        try {
            Blog blog1 = blogService.deleteBlog(blogId);
            dbsResponseEntity.setMessage("Blog Deleted Successfully.");
            return ResponseEntity.ok(dbsResponseEntity);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("v1/blogs/{blogId}")
    public ResponseEntity<DBSResponseEntity> getBlogCall(@PathVariable String blogId)
    {
        DBSResponseEntity dbsResponseEntity=new DBSResponseEntity();

        try {
            Blog blog1 = blogService.deleteBlog(blogId);
            dbsResponseEntity.setData(blog1);
            return ResponseEntity.ok(dbsResponseEntity);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("v1/blogs")
    public ResponseEntity<DBSResponseEntity> getBlogsCall(@RequestParam(defaultValue = "0") Integer pageNumber,
                                                          @RequestParam(defaultValue = "10") Integer size,
                                                          @RequestParam(defaultValue = "id") String sortBy,
                                                          @RequestParam(defaultValue = "1") String userId

    )
    {
        DBSResponseEntity dbsResponseEntity=new DBSResponseEntity();
        CommonPaginationRequest commonPaginationRequest=new CommonPaginationRequest();
        commonPaginationRequest.setPageNo(pageNumber);
        commonPaginationRequest.setPageSize(size);
        commonPaginationRequest.setSortBy(sortBy);
        commonPaginationRequest.setValue(userId);
        try {
            List<Blog> blog1 = blogService.getBlogs(commonPaginationRequest);
            dbsResponseEntity.setData(blog1);
            return ResponseEntity.ok(dbsResponseEntity);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
