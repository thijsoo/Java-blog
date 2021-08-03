package codes.thijs.blogapi.exceptions;

public class AuthorNotFoundException extends RuntimeException{

    public AuthorNotFoundException(Long id) {
        super("Could not find author " + id);
    }


}
