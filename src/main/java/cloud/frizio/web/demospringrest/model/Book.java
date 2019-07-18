package cloud.frizio.web.demospringrest.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Book
 */
@Entity
@Data
@NoArgsConstructor
public class Book {

	@Id
    @GeneratedValue
    private Long id;
    
    private String name;
    
    private String author;
    
    private BigDecimal price;

    public Book(String name, String author, BigDecimal price) {
        this.name   = name;
        this.author = author;
        this.price  = price;
    }

}