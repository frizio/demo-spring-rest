package cloud.frizio.web.demospringrest.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Book
 */
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    
    private String author;
    
    private BigDecimal price;
    
}