package com.sportShedule.impl;

import com.sportShedule.entity.Category;
import com.sportShedule.repository.CategoryRepository;
import com.sportShedule.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(
                ()->new RuntimeException("couldn't find category by id - "+id)
        );
    }

    @Override
    public Collection<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }
}
