package com.example.blogapp.services;

import com.example.blogapp.interfaces.PostServiceInterface;
import com.example.blogapp.models.Post;
import com.example.blogapp.enums.Category;
import com.example.blogapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService implements PostServiceInterface {
    private static final List<Post> posts = new ArrayList<>();

     static {
         posts.add(new Post(1L, "First Post", "This is my first post", "John Doe",Category.SPORT));
         posts.add(new Post(2L, "Second Post", "This is my second post", "Christ John",Category.POLITICS));
         posts.add(new Post(3L, "Third Post", "This is my third post", "Ali Doe",Category.ECONOMY));
         posts.add(new Post(4L, "Fourth Post", "This is my fourth post", "John Isaac",Category.TECHNOLOGY));
     }
     private final PostRepository postRepository;
    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts() {
            return postRepository.findAll();
        }


        public Post getPostById(Long id) {
            return posts.stream()
                    .filter(post -> post.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        public void createPost(Post post) {
            posts.add(post);
        }

        public void deletePost(Long id) {
            posts.removeIf(post -> post.getId() == id);
        }

        public void updatePost(Long id, Post post) {
            Post oldPost = getPostById(id);
            oldPost.setTitle(post.getTitle());
            oldPost.setAuthor(post.getAuthor());
            oldPost.setContent(post.getContent());
            oldPost.setCategory(post.getCategory());
        }

}
