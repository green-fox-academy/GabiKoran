package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.models.entities.Rate;
import com.greenfoxacademy.reddit.models.entities.RateId;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.RateRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RateServiceImpl implements RateService {

    private PostRepository postRepository;
    private UserRepository userRepository;
    private RateRepository rateRepository;

    @Autowired
    public RateServiceImpl(PostRepository postRepository, UserRepository userRepository, RateRepository rateRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.rateRepository = rateRepository;
    }

    @Override
    public void rate(Long postId, Long userId, Integer ratingValue) {
        RateId checkedRateId = new RateId(userId, postId);
        Optional<Rate> currentRate = rateRepository.findById(checkedRateId);
        Post currentPost = postRepository.findById(postId).get();


        if (!currentRate.isPresent()) {
            rateRepository.save(new Rate(new RateId(userId, postId), ratingValue));
            currentPost.rate(ratingValue);
            postRepository.save(currentPost);
        } else if (currentRate.isPresent() && currentRate.get().getRatingValue() != ratingValue) {
            currentRate.get().setRatingValue(ratingValue);
            currentPost.rate(ratingValue * 2);
            postRepository.save(currentPost);
        }
    }
}
