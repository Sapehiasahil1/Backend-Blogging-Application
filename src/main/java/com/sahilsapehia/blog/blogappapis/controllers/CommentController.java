package com.sahilsapehia.blog.blogappapis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahilsapehia.blog.blogappapis.payloads.ApiResponse;
import com.sahilsapehia.blog.blogappapis.payloads.CommentDto;
import com.sahilsapehia.blog.blogappapis.services.CommentService;

@RestController
@RequestMapping("/api/")
public class CommentController {
    

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment, @PathVariable(name = "postId") Integer postId) {

        CommentDto createComment = this.commentService.createComment(comment, postId);

        return new ResponseEntity<>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable(name = "commentId") Integer commentId) {
        
        this.commentService.deleteComment(commentId);

        return new ResponseEntity<>(new ApiResponse("Comment delete successfully !!",true),HttpStatus.OK);
    }
}
