package codes.thijs.blogapi.repositories;

import codes.thijs.blogapi.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
