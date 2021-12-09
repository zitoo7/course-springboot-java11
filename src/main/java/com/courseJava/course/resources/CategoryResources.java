package com.courseJava.course.resources;

import com.courseJava.course.entities.Category;
import com.courseJava.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> findAll(){
        return service.findAll();
    }
    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable Long id){
        return service.findById(id);
    }
}
