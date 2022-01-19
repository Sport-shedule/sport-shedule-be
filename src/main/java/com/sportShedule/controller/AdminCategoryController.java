package com.sportShedule.controller;

import com.sportShedule.entity.Category;
import com.sportShedule.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/category")
@CrossOrigin(originPatterns = {"*"})
public class AdminCategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(code= HttpStatus.CREATED)
    private Category createCategory(@RequestBody Category category){
        return categoryService.save(category);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private void removeCategoryById(@PathVariable Long id){
        categoryService.remove(id);
    }
}
