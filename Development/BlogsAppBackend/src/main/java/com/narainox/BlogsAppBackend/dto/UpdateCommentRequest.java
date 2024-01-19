package com.narainox.BlogsAppBackend.dto;

import com.narainox.BlogsAppBackend.model.Blog;
import com.narainox.BlogsAppBackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCommentRequest {

    private String commentId;
    private String title;
    private Integer user;
    private Integer blog;

}
