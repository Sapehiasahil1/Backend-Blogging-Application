package com.sahilsapehia.blog.blogappapis.services;

import java.util.List;

import com.sahilsapehia.blog.blogappapis.payloads.PostDto;

public interface PostService {
    
    //create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //update
    PostDto updatePost(PostDto postDto, Integer postId);

    //delete
    void deletePost(Integer postId);

    //getAllPosts
    List<PostDto> getAllPost();

    //getSinglePost
    PostDto getPostById(Integer postId);

    // get all post by category
    List<PostDto> getPostsByCategory(Integer categoryId);

    //get all posts by user
    List<PostDto> getPostsByUser(Integer userId);

    //get post by keyword
    List<PostDto> searchPosts(String keyword);
}
