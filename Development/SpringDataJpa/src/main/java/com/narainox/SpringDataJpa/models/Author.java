package com.narainox.SpringDataJpa.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Builder
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue
    /*
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )
    @TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )

    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    */
    private Integer id;
    @Column(
            name = "first_name",
            length = 35
    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Integer age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;




    /*
    @Column
            (
                    updatable = false,
                    nullable = false
            )
    private LocalDateTime createdDate;
    @Column
            (
            insertable = false
            )
    private LocalDateTime lastModified;

     */
}
