package com.inventory.response;

import java.util.List;

import com.inventory.models.Category;

public class CategoryResponse {
    
    private List<Category> category;

    public CategoryResponse() {
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    

}
