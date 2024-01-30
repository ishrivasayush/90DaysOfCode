package com.narainox.SpringsecurityJWT.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
    private String id;
    private String name;
    private String email;
}
