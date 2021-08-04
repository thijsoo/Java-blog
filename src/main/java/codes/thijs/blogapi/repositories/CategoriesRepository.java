package codes.thijs.blogapi.repositories;

import codes.thijs.blogapi.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
