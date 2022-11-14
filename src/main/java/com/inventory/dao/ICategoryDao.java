package com.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.inventory.models.Category;

public interface ICategoryDao extends CrudRepository<Category,Long>{
    
}
