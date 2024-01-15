package com.narainox.BlogsAppBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommentResponse {
    @Id
    private String commentId;
    private String title;
    private ObjectId user;
    private ObjectId blog;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
