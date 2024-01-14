package com.narainox.BlogsAppBackend.service.impl;

import com.narainox.BlogsAppBackend.model.Comment;
import com.narainox.BlogsAppBackend.repository.CommentRepository;
import com.narainox.BlogsAppBackend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment)throws Exception
    {
        return commentRepository.save(comment);
    }
    public Comment updateComment(Comment comment)throws Exception
    {
        return commentRepository.save(comment);
    }
    public Comment deleteComment(String commentId)throws Exception
    {
        return commentRepository.deleteByCommentId(commentId);
    }
    public List<Comment> getComment(String blogId, Pageable pageable)
    {
        return commentRepository.findByBlogId(blogId,pageable);
    }
}
