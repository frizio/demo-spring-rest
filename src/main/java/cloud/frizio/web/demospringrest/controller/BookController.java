package cloud.frizio.web.demospringrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cloud.frizio.web.demospringrest.repository.BookRepository;;

/**
 * BookController
 */
@RestController
public class BookController {

    @Autowired
    private BookRepository repository;
}