package com.myblog.myblog1.service;

import com.myblog.myblog1.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    public PostDto getPostById(long id);


    List<PostDto> getAllPosts();
}
