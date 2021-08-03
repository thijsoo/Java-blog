package codes.thijs.blogapi.service.impl;

import codes.thijs.blogapi.exceptions.PostNotFoundException;
import codes.thijs.blogapi.exceptions.ResourceNotFoundException;
import codes.thijs.blogapi.models.Post;
import codes.thijs.blogapi.repositories.PostRepository;
import codes.thijs.blogapi.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post savePost(Post post) {
       return this.postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public Post getPost(long id) {
        return this.postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
    }

}
