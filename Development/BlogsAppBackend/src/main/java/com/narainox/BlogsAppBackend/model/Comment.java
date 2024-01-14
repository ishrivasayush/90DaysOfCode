package com.narainox.BlogsAppBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Comment {
    @Id
    private String commentId;
    private String title;
    private ObjectId user;
    private ObjectId blog;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
