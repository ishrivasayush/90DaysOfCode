package com.narainox.BlogsAppBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BlogResponse {

    private Integer blogId;
    private String title;
    private String description;
    private Boolean publish;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
