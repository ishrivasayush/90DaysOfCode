package com.narainox.BlogsAppBackend.service;

import com.narainox.BlogsAppBackend.model.Comment;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentService {
    Comment createComment(Comment comment)throws Exception;
    Comment updateComment(Comment comment)throws Exception;
    Comment deleteComment(String commentId)throws Exception;
    List<Comment> getComment(String blogId, Pageable pageable);
}
