package com.example.blogapp.controllers;

import com.example.blogapp.interfaces.PostControllerInterface;
import com.example.blogapp.models.Post;
import com.example.blogapp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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
    @GetMapping(path = "/{id}")
    public String getPostById(@PathVariable() Long id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "post";
    }

    @GetMapping(path = "/create")
    public String getCreatePostPage(Model model) {
        model.addAttribute("post", new Post());
        return "create-post";
    }

    @PostMapping(path = "/create/new")
    public String createPost(@ModelAttribute Post post) {
        post.setId(postService.getPosts().size() + 1);
        postService.createPost(post);
        return "redirect:/posts";
    }
    @DeleteMapping(path = "delete/{id}")
    public String deletePost(@PathVariable() Long id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
}
