package com.narainox.books.service.impl;

import com.narainox.books.model.Book;
import com.narainox.books.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookServiceImpl underTest;

    @Test
    public void testThatBookIsSaved()
    {
        final Book book= Book.builder()
                .isbn("080891")
                .author("Ayush")
                .title("java")
                .build();

        final Book book1 = underTest.createBook(book);

    }
}
