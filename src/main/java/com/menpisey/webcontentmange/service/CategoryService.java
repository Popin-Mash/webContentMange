package com.menpisey.webcontentmange.service;

import com.menpisey.webcontentmange.models.Category;

import java.util.List;

public interface CategoryService {
        List<Category> getAllCategories();
         Category create(Category  category);
}
