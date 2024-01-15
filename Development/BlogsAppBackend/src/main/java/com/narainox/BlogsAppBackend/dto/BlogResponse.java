package com.narainox.BlogsAppBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class BlogResponse {
    @Id
    private ObjectId blogId;
    private String title;
    private String description;
    private Boolean publish;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
