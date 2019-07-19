package cloud.frizio.web.demospringrest.validator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * AuthorValidator
 */
public class AuthorValidator implements ConstraintValidator<Author, String> {

    List<String> authors = Arrays.asList("Santideva", "Marie Kondo", "Martin Fowler", "mkyong");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return authors.contains(value);
    }
}