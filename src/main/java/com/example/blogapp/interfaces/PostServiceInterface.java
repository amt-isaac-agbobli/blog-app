package com.example.blogapp.interfaces;

import com.example.blogapp.models.Post;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public interface PostServiceInterface {
    public List<Post> getPosts();

    public Post getPostById(Long id);
    public void createPost(@ModelAttribute() Post post);
    public  void deletePost(Long id);
}
