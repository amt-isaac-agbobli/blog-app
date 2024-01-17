package com.example.blogapp.services;

import com.example.blogapp.models.Post;
import com.example.blogapp.utils.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService {
    private static final List<Post> posts = new ArrayList<>();

     static {
         posts.add(new Post(1L, "First Post", "This is my first post", "John Doe",Category.SPORT));
         posts.add(new Post(2L, "Second Post", "This is my second post", "Christ John",Category.POLITICS));
         posts.add(new Post(3L, "Third Post", "This is my third post", "Ali Doe",Category.ECONOMY));
         posts.add(new Post(4L, "Fourth Post", "This is my fourth post", "John Isaac",Category.TECHNOLOGY));
     }

        public List<Post> getPosts() throws InterruptedException {
            return posts;
        }

}