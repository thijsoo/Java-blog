package codes.thijs.blogapi.controller.admin;

import codes.thijs.blogapi.models.Post;
import codes.thijs.blogapi.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/blog")
public class PostAdminController {
    private PostService postService;

    @PostMapping
    public ResponseEntity<Post> savePost(@RequestBody Post post){
        return new ResponseEntity<Post>(this.postService.savePost(post), HttpStatus.CREATED);
    }
}
