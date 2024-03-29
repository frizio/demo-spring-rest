package cloud.frizio.web.demospringrest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cloud.frizio.web.demospringrest.model.Book;

/**
 * BookRepository
 */
public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findByAuthor(String string);

}