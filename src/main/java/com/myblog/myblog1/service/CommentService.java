package com.myblog.myblog1.service;

import com.myblog.myblog1.payload.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, long postId);

    void deleteComment(long id);


    void updateComment(long id, CommentDto commentDto);
}
