package com.example.blogapp.interfaces;

import com.example.blogapp.models.Post;
import org.springframework.ui.Model;

public interface PostControllerInterface {
    public String getPosts(Model model);
    public String getPostById(Long id, Model model);
    public String getCreatePostPage(Model model);
//    public  String createPost(Post post, Model model);
}
