package codes.thijs.blogapi.exceptions;

public class PostNotFoundException extends RuntimeException{

    public PostNotFoundException(Long id) {
        super("Could not find post " + id);
    }
}
