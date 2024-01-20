package com.narainox.SpringDataJpa;

import com.narainox.SpringDataJpa.models.Author;
import com.narainox.SpringDataJpa.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringDataJpaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository)
	{
		return args -> {
			Author author= Author.builder()
					.firstName("Ayush")
					.lastName("Shrivastava")
					.age(21)
					.email("ayushstwt@gmail.com")
					.createdDate(LocalDateTime.now())
					.lastModified(LocalDateTime.now())
					.build();
			authorRepository.save(author);
		};
	}
}
