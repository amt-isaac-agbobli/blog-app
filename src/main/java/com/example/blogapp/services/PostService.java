package com.example.blogapp.services;

import com.example.blogapp.interfaces.PostServiceInterface;
import com.example.blogapp.models.Post;
import com.example.blogapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService implements PostServiceInterface {
    private static final List<Post> posts = new ArrayList<>();

     static {
         posts.add(new Post(1L, "First Post", "This is my first post", "John Doe", "SPORT"));
         posts.add(new Post(2L, "Second Post", "This is my second post", "Christ John", "POLITICS"));
         posts.add(new Post(3L, "Third Post", "This is my third post", "Ali Doe", "ECONOMY"));
         posts.add(new Post(4L, "Fourth Post", "This is my fourth post", "John Isaac", "TECHNOLOGY"));
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
            return postRepository.findById(id).orElse(null);
        }

        public void createPost(Post post) {
            postRepository.save(post);
        }

        public void deletePost(Long id) {
            postRepository.deleteById(id);
        }

        public void updatePost(Long id, Post post) {
            Post postToUpdate = postRepository.findById(id).orElse(null);
            assert postToUpdate != null;
            postToUpdate.setTitle(post.getTitle());
            postToUpdate.setContent(post.getContent());
            postToUpdate.setAuthor(post.getAuthor());
            postToUpdate.setCategory(post.getCategory());
            postRepository.save(postToUpdate);
        }

}
