package codes.thijs.blogapi.service;

import codes.thijs.blogapi.models.Post;

import java.util.List;

public interface PostService {

    Post savePost(Post post);
    List<Post> getAllPosts();
    Post getPost(long id);

}
