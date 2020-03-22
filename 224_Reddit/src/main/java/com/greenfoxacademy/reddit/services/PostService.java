package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {

    Post save(Post post);
    Page<Post> findAllPostsOrderByRatingDesc(Pageable pageable);
    void incrementRating(Long id);
    void decrementRating(Long id);

    Page<Post> page001();
    Page<Post> page002();
    Page<Post> page003();
    Page<Post> page004();
    Page<Post> page005();
}
