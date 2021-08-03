package codes.thijs.blogapi.controller;

import codes.thijs.blogapi.models.Post;
import codes.thijs.blogapi.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/blog")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }



   @PostMapping
   public ResponseEntity<Post> savePost(@RequestBody Post post){
        return new ResponseEntity<Post>(this.postService.savePost(post), HttpStatus.CREATED);
   }
   @GetMapping("/blogs")
   public List<Post> getAllPosts(){
        return this.postService.getAllPosts();
   }

    @GetMapping("/{id}")
   public Post getPost(@PathVariable Long id){return this.postService.getPost(id);}
}
