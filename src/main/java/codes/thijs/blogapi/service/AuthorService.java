package codes.thijs.blogapi.service;

import codes.thijs.blogapi.models.Author;

import java.util.List;

public interface AuthorService {

    Author getAuthor(long id);
    Author saveAuthor(Author author);
    List<Author> getAllAuthors();
}
