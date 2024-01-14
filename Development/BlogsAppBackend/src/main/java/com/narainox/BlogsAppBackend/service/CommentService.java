package com.narainox.BlogsAppBackend.service;

import com.narainox.BlogsAppBackend.model.Comment;

public interface CommentService {
    Comment createComment(Comment comment)throws Exception;
    Comment updateComment(Comment comment)throws Exception;
    Comment deleteComment(String commentId)throws Exception
}
