package codes.thijs.blogapi.controller;

import codes.thijs.blogapi.models.Author;
import codes.thijs.blogapi.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


   @GetMapping("/authors")
   public List<Author> getAllAuthors(){
        return this.authorService.getAllAuthors();
   }

    @GetMapping("/{id}")
   public Author getAuthor(@PathVariable Long id){return this.authorService.getAuthor(id);}
}
