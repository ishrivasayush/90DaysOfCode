package com.narainox.BlogsAppBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String commentId;
    private String title;
    private Integer user;
    private Integer blog;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
