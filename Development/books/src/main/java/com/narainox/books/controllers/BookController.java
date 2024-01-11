package com.narainox.books.controllers;

import com.narainox.books.model.Book;
import com.narainox.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(path = "/books")
    public ResponseEntity<Book> createBook(@RequestBody final Book book)
    {
        Book book1 = bookService.createBook(book);
        return new ResponseEntity<>(book1, HttpStatus.CREATED);
    }

    @GetMapping(path="/book/isbn")
    public ResponseEntity<Book> getBookById(@PathVariable final String isbn)
    {
        Optional<Book> getBook = bookService.getBook(isbn);
        return getBook.map(book->new ResponseEntity(book,HttpStatus.FOUND)).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

}
