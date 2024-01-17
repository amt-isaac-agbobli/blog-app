package com.example.blogapp.interfaces;

import org.springframework.ui.Model;

public interface PostControllerInterface {
    public String getPosts(Model model);
    public String getPostById(Long id, Model model);
}
