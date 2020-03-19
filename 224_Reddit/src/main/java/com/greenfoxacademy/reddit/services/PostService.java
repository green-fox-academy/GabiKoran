package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.entities.Post;

import java.util.List;

public interface PostService {

    List<Post> findAllPosts();
    Post save(Post post);
}
