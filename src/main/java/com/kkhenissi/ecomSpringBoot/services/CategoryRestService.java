package com.kkhenissi.ecomSpringBoot.services;

import com.kkhenissi.ecomSpringBoot.dao.CategoryRepository;
import com.kkhenissi.ecomSpringBoot.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryRestService {
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/listCategories")
    private List<Category> listCategories() {
        return categoryRepository.findAll();
    }
}
