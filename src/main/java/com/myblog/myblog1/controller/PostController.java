package com.myblog.myblog1.controller;

import com.myblog.myblog1.payload.PostDto;
import com.myblog.myblog1.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }

    // http://localhost:8080/api/posts/particular?id=1

    @GetMapping("/particular")
    public ResponseEntity<PostDto> getPostById(@RequestParam long id){

        PostDto dto = postService.getPostById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @GetMapping
    public List<PostDto>  getAllPosts(){
        List<PostDto> postDtos = postService.getAllPosts();
        return postDtos;

    }

}
