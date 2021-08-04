package codes.thijs.blogapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AuthorNotFoundException extends RuntimeException{

    public AuthorNotFoundException(Long id) {
        super("Could not find author " + id);
    }


}
