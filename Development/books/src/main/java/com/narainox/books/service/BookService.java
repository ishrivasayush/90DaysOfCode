package com.narainox.books.service;


import com.narainox.books.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book createBook(Book book);
    Optional<Book> getBook(String isbn);
    List<Book> getAllBooks();


}
