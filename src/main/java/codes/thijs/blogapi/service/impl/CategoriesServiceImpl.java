package codes.thijs.blogapi.service.impl;

import codes.thijs.blogapi.exceptions.CategoryNotFoundException;
import codes.thijs.blogapi.models.Categories;
import codes.thijs.blogapi.repositories.CategoriesRepository;
import codes.thijs.blogapi.service.CategoriesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public Categories getCategories(long id) {
        return this.categoriesRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));
    }

    @Override
    public Categories saveCategories(Categories category) {
        return this.categoriesRepository.save(category);
    }

    @Override
    public List<Categories> getAllCategories() {
        return this.categoriesRepository.findAll();
    }
}
