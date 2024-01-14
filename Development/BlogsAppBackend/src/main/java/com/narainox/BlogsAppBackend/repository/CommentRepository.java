package com.narainox.BlogsAppBackend.repository;

import com.narainox.BlogsAppBackend.model.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {
    Comment deleteByCommentId(String commentId);
    List<Comment> findByBlogId(String blogId, Pageable pageable);
}
