package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post save(Post post, Long userId) {
        if (userRepository.findById(userId).isPresent()) {
            post.setOwner(userRepository.findById(userId).get());
        }
        return postRepository.save(post);
    }

    @Override
    public Page<Post> findAllPostsOrderByRatingDesc(Pageable pageable) {
        return postRepository.findAllByOrderByRatingDesc(pageable);
    }

    @Override
    public Page<Post> listPosts(Integer page) {
        Pageable pageable = PageRequest.of(0, 10);
        if (page != null) {
            pageable = PageRequest.of(page, 10);
        }
        return postRepository.findAllByOrderByRatingDesc(pageable);
    }

    @Override
    public void incrementRating(Long id) {
        Optional current = postRepository.findById(id);
        if (current.isPresent()) {
            Post currentPost = (Post) current.get();
            currentPost.setRating(currentPost.getRating() + 1);
            save(currentPost);
        }
    }

    @Override
    public void decrementRating(Long id) {
        Optional current = postRepository.findById(id);
        if (current.isPresent()) {
            Post currentPost = (Post) current.get();
            currentPost.setRating(currentPost.getRating() - 1);
            save(currentPost);
        }
    }

    @Override
    public Integer numberOfPages() {
        Integer postsNumbers = postRepository.countAllBy();
        if (postsNumbers%10 != 0) {
            return postsNumbers/10 + 1;
        } else {
            return postsNumbers/10;
        }
    }

    @Override
    public int[] pages() {
        int[] pages = new int[numberOfPages()];
        for (int i = 0; i < numberOfPages(); i++) {
            pages[i] = i + 1;
        }
        return pages;
    }
}
