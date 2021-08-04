package codes.thijs.blogapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PostNotFoundException extends RuntimeException{

    public PostNotFoundException(Long id) {
        super("Could not find post " + id);
    }
}
