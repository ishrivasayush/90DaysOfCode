package com.narainox.BlogsAppBackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UpdateBlogRequest {

    @NotBlank(message = "Blog Id is Required Parameter.")
    private Integer blogId;
    @NotBlank(message = "Title is Required Parameter.")
    private String title;
    @NotBlank(message = "Description is Required Parameter.")
    private String description;
    @NotNull(message = "Publish is Required Parameter.")
    private Boolean publish;
    @NotBlank(message = "UserId is required parameter.")
    private Integer userId;


}
