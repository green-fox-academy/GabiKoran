package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.entities.Post;

import java.util.List;

public interface PostService {

    Post save(Post post);
    List<Post> findAllPostsOrderByRatingDesc();
    void incrementRating(Long id);
    void decrementRating(Long id);
}
