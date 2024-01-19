package com.example.blogapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_sequence")
    private Long id;
    private java.lang.String title;
    private java.lang.String content;
    private java.lang.String author;

    private String category;

    public Post() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public java.lang.String getContent() {
        return content;
    }

    public void setContent(java.lang.String content) {
        this.content = content;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String string) {
        this.category = string;
    }

    public Post(Long id , java.lang.String title, java.lang.String content, java.lang.String author, String string) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = string;
    }
    public Post(java.lang.String title, java.lang.String content, java.lang.String author, String string) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = string;
    }

    public java.lang.String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }


}
