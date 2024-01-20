package com.narainox.SpringDataJpa.repository;

import com.narainox.SpringDataJpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
