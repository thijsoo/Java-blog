package codes.thijs.blogapi.controller.admin;

import codes.thijs.blogapi.models.Author;
import codes.thijs.blogapi.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/author")
public class AuthorAdminController {

    private final AuthorService authorService;

    public AuthorAdminController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
        return new ResponseEntity<Author>(this.authorService.saveAuthor(author), HttpStatus.CREATED);
    }
}
