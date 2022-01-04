package com.sportShedule.service;

import com.sportShedule.entity.Category;

import java.util.Collection;

public interface CategoryService {
    Category save(Category category);
    Category findById(Long id);
    Collection<Category> findAll();
    void remove(Long id);
}
