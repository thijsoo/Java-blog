package codes.thijs.blogapi.service.impl;

import codes.thijs.blogapi.exceptions.AuthorNotFoundException;
import codes.thijs.blogapi.models.Author;
import codes.thijs.blogapi.repositories.AuthorRepository;
import codes.thijs.blogapi.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getAuthor(long id) throws AuthorNotFoundException {
        return this.authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException(id));
    }

    @Override
    public Author saveAuthor(Author author) {
        return this.authorRepository.save(author);

    }

    @Override
    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }
}
