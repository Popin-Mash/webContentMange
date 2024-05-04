package com.menpisey.webcontentmange.service.imp;

import com.menpisey.webcontentmange.models.Category;
import com.menpisey.webcontentmange.repository.CategoryRepository;
import com.menpisey.webcontentmange.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryImp implements CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
    }

    @Override
    public Category create(Category category) {
        return null;
    }

}
