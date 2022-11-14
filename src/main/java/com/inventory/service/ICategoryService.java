package com.inventory.service;

import org.springframework.http.ResponseEntity;

import com.inventory.response.CategoryResponseRest;

public interface ICategoryService {
    
    public ResponseEntity<CategoryResponseRest> search();

}
