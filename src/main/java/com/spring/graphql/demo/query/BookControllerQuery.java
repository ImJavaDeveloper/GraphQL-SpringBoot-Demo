package com.spring.graphql.demo.query;
import com.spring.graphql.demo.model.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookControllerQuery {

    private final List<Book> books = List.of(
            new Book("1", "Clean Code", "Robert Martin"),
            new Book("2", "Effective Java", "Joshua Bloch")
    );
    @QueryMapping
    public List<Book> getAllBooks() {
        return books;
    }
    @QueryMapping
    public Book getBook(@Argument String id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
