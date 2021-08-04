package codes.thijs.blogapi.controller;

import codes.thijs.blogapi.models.Categories;
import codes.thijs.blogapi.service.CategoriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesService CategoriesService) {
        this.categoriesService = CategoriesService;
    }

   @PostMapping
   public ResponseEntity<Categories> saveCategories(@RequestBody Categories categories){
        return new ResponseEntity<Categories>(this.categoriesService.saveCategories(categories), HttpStatus.CREATED);
   }
   @GetMapping("/categories")
   public List<Categories> getAllCategories(){
        return this.categoriesService.getAllCategories();
   }

    @GetMapping("/{id}")
   public Categories getCategories(@PathVariable Long id){return this.categoriesService.getCategories(id);}
}
