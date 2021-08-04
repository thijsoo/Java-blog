package codes.thijs.blogapi.controller.admin;

import codes.thijs.blogapi.models.Categories;
import codes.thijs.blogapi.service.CategoriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/categories")
public class CategoriesAdminController {

    private final CategoriesService categoriesService;

    public CategoriesAdminController(CategoriesService CategoriesService) {
        this.categoriesService = CategoriesService;
    }

   @PostMapping
   public ResponseEntity<Categories> saveCategories(@RequestBody Categories categories){
        return new ResponseEntity<Categories>(this.categoriesService.saveCategories(categories), HttpStatus.CREATED);
   }
}
