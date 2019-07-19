package cloud.frizio.web.demospringrest;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cloud.frizio.web.demospringrest.model.Book;
import cloud.frizio.web.demospringrest.repository.BookRepository;;

@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private BookRepository repository;

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        log.info("Applicazione in esecuzione");
	}

	@Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            log.info("Inizializzazione database");
            repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")));
            repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
            repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99")));
        
            log.info("################ findAll() ################");
            repository.findAll().forEach(x -> System.out.println(x));
            log.info("###########################################");

            log.info("################ findById() ################");
            repository.findById(2l).ifPresent(x -> System.out.println(x));
            log.info("###########################################");
            log.info("############## findByAuthor() ##############");
            repository.findByAuthor("Martin Fowler").ifPresent(x -> System.out.println(x));
            log.info("###########################################");
        };
    }

}
