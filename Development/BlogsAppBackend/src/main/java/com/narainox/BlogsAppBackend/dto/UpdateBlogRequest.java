package com.narainox.BlogsAppBackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UpdateBlogRequest {

    @NotBlank(message = "Blog Id is Required Parameter.")
    private ObjectId blogId;
    @NotBlank(message = "Title is Required Parameter.")
    private String title;
    @NotBlank(message = "Description is Required Parameter.")
    private String description;
    @NotNull(message = "Publish is Required Parameter.")
    private Boolean publish;
    @NotBlank(message = "UserId is required parameter.")
    private String userId;


}
