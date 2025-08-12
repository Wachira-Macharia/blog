package com.comboni.blog.services;

import com.comboni.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
}
