package cloud.frizio.web.demospringrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cloud.frizio.web.demospringrest.model.Book;

/**
 * BookRepository
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}