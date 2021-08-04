package codes.thijs.blogapi.service;

import codes.thijs.blogapi.exceptions.AuthorNotFoundException;
import codes.thijs.blogapi.models.Author;

import java.util.List;

public interface AuthorService {

    Author getAuthor(long id) throws AuthorNotFoundException;
    Author saveAuthor(Author author);
    List<Author> getAllAuthors();
}
