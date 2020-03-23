package com.greenfoxacademy.reddit.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @JoinTable(name = "ownership")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Post> posts;

    public User() {
        posts = new ArrayList<>();
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        posts = new ArrayList<>();
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        posts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
        posts.stream().forEach(post -> post.setOwner(this));
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }
}
