package codes.thijs.blogapi.service;

import codes.thijs.blogapi.models.Categories;

import java.util.List;

public interface CategoriesService {

    Categories getCategories(long id);
    Categories saveCategories(Categories author);
    List<Categories> getAllCategories();
}
