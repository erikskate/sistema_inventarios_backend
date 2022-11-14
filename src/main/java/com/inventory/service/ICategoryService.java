package com.inventory.service;

import org.springframework.http.ResponseEntity;

import com.inventory.models.Category;
import com.inventory.response.CategoryResponseRest;

public interface ICategoryService {
    
    public ResponseEntity<CategoryResponseRest> search();
    public ResponseEntity<CategoryResponseRest> searchById(Long id);
    public ResponseEntity<CategoryResponseRest> save(Category category );
    public ResponseEntity<CategoryResponseRest> update(Category category, Long id );
    public ResponseEntity<CategoryResponseRest> delete(Long id);
}
