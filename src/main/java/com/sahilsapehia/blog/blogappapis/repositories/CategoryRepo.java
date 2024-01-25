package com.sahilsapehia.blog.blogappapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahilsapehia.blog.blogappapis.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    
}
