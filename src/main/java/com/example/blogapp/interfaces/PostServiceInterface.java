package com.example.blogapp.interfaces;

import com.example.blogapp.models.Post;

import java.util.List;

public interface PostServiceInterface {
    public List<Post> getPosts();

    public Post getPostById(Long id);
    public  String createPost(Post post);
}
