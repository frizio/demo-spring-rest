package cloud.frizio.web.demospringrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cloud.frizio.web.demospringrest.model.Book;
import cloud.frizio.web.demospringrest.repository.BookRepository;;

/**
 * BookController
 */
@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    // Find
    @GetMapping("/books")
    List<Book> findAll() {
        return repository.findAll();
    }
    
}