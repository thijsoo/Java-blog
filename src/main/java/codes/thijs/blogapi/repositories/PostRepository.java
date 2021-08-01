package codes.thijs.blogapi.repositories;

import codes.thijs.blogapi.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
