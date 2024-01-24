package com.sahilsapehia.blog.blogappapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahilsapehia.blog.blogappapis.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    
}
