package com.narainox.SpringDataJpa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@NoArgsConstructor
@Data
@Entity
public class Author {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
