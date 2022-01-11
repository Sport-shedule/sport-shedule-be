package com.sportShedule.controller;

import com.sportShedule.entity.Category;
import com.sportShedule.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/admin/category")
@CrossOrigin(origins = {"https://sportschedule.herokuapp.com"})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(code= HttpStatus.CREATED)
    private Category create(@RequestBody Category category){
        return categoryService.save(category);
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Category findById(@PathVariable Long id){
        return categoryService.findById(id);
    }

    @GetMapping("/all")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private Collection<Category> findAll(){
        return categoryService.findAll();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    private void removeById(@PathVariable Long id){
        categoryService.remove(id);
    }

}
