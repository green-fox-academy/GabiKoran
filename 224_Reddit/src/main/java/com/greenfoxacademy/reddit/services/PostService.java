package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {

    Post save(Post post);

    Post save(Post post, Long userId);

    Page<Post> findAllPostsOrderByRatingDesc(Pageable pageable);

    void incrementRating(Long id);

    void decrementRating(Long id);

    Page<Post> listPosts(Integer page);

    Integer numberOfPages();

    int[] pages();
}
