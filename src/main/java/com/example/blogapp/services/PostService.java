package com.example.blogapp.services;

import com.example.blogapp.models.Post;
import com.example.blogapp.utils.Category;

import java.util.ArrayList;
import java.util.List;

public class PostService {
    private static  List<Post> posts = new ArrayList<>();

     static {
         posts.add(new Post(1L, "First Post", "This is my first post", "John Doe",Category.SPORT));
         posts.add(new Post(2L, "Second Post", "This is my second post", "John Doe",Category.POLITICS));
         posts.add(new Post(3L, "Third Post", "This is my third post", "John Doe",Category.ECONOMY));
         posts.add(new Post(4L, "Fourth Post", "This is my fourth post", "John Doe",Category.TECHNOLOGY));
     }

}
