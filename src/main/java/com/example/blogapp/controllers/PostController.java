package com.example.blogapp.controllers;

import com.example.blogapp.interfaces.PostControllerInterface;
import com.example.blogapp.models.Post;
import com.example.blogapp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController implements PostControllerInterface {
    private  final PostService postService;
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public String getPosts(Model model) {
        model.addAttribute("posts", postService.getPosts());
        return "posts";
    }
}
