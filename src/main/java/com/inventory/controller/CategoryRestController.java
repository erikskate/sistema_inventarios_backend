package com.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.models.Category;
import com.inventory.response.CategoryResponseRest;
import com.inventory.service.ICategoryService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CategoryRestController {
    
    @Autowired
    private ICategoryService categoryService;

    /**
     * Get all the categories
     * @return
     */
    @GetMapping("/categories")
    public ResponseEntity<CategoryResponseRest> searchCategories(){

        ResponseEntity<CategoryResponseRest> response = categoryService.search();
        return response;
    }

    /**
     * Get categories by ID
     * @param id
     * @return
     */
    @GetMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable("id") Long id){

        ResponseEntity<CategoryResponseRest> response = categoryService.searchById(id);
        return response;
    }

    /**
     * Save Category
     * @param Category
     * @return
     */
    @PostMapping("/categories")
    public ResponseEntity<CategoryResponseRest> saveCategory(@RequestBody Category category){
        ResponseEntity<CategoryResponseRest> response = categoryService.save(category);
        return response;
    }

    /**
     * UPDATE Categories
     * @param Category
     * @param id
     * @return
     */
    @PutMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseRest> updateCategory(@RequestBody Category category,@PathVariable("id") Long id){
        ResponseEntity<CategoryResponseRest> response = categoryService.update(category,id);
        return response;
    }

    /**
     * Delete category
     * @param id
     * @return
     */
    @DeleteMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseRest> updateCategory(@PathVariable("id") Long id){
        ResponseEntity<CategoryResponseRest> response = categoryService.delete(id);
        return response;
    }

}
