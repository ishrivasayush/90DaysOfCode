package com.narainox.BlogsAppBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DBSResponseEntity<T> {
    private String message;
    private T data;
}
