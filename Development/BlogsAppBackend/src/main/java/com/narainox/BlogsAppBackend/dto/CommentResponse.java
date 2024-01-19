package com.narainox.BlogsAppBackend.dto;

import com.narainox.BlogsAppBackend.model.Blog;
import com.narainox.BlogsAppBackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.data.annotation.Id;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommentResponse {
    @Id
    private String commentId;
    private String title;
    private User user;
    private Blog blog;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
