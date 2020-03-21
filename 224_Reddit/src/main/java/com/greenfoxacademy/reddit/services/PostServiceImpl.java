package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Page<Post> findAllPostsOrderByRatingDesc(Pageable pageable) {
        return postRepository.findAllByOrderByRatingDesc(pageable);
    }

    @Override
    public Page<Post> page001() {
        Pageable page = PageRequest.of(0, 10);
        return postRepository.findAllByOrderByRatingDesc(page);
    }

    @Override
    public Page<Post> page002() {
        Pageable page = PageRequest.of(1, 10);
        return postRepository.findAllByOrderByRatingDesc(page);
    }

    @Override
    public Page<Post> page003() {
        Pageable page = PageRequest.of(2, 10);
        return postRepository.findAllByOrderByRatingDesc(page);
    }

    @Override
    public Page<Post> page004() {
        Pageable page = PageRequest.of(3, 10);
        return postRepository.findAllByOrderByRatingDesc(page);
    }

    @Override
    public Page<Post> page005() {
        Pageable page = PageRequest.of(4, 10);
        return postRepository.findAllByOrderByRatingDesc(page);
    }

    @Override
    public void incrementRating(Long id) {
        Optional current = postRepository.findById(id);
        if (current.isPresent()) {
            Post currentPost = (Post)current.get();
            currentPost.setRating(currentPost.getRating()+1);
            save(currentPost);
        }
    }

    @Override
    public void decrementRating(Long id) {
        Optional current = postRepository.findById(id);
        if (current.isPresent()) {
            Post currentPost = (Post)current.get();
            currentPost.setRating(currentPost.getRating()-1);
            save(currentPost);
        }
    }
}
