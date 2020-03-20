package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Post> findAllPostsOrderByRatingDesc() {
        return postRepository.findAllByOrderByRatingDesc();
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
