package com.klef.jfsd.exam;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Spring Boot in Action");
        book1.setAuthor("John Doe");
        book1.setGenre("Technology");
        book1.setPrice(25.99);
        book1.setPublishedYear(2020);
        bookRepository.save(book1);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Java Programming");
        book2.setAuthor("Jane Doe");
        book2.setGenre("Technology");
        book2.setPrice(20.50);
        book2.setPublishedYear(2018);
        bookRepository.save(book2);
    }
}
