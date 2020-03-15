package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.entities.Rate;
import com.greenfoxacademy.reddit.models.entities.RateId;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.RateRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void ratePlus(Long postId, Long userId) {
        RateId checkId = new RateId(userId, postId);
        if (!rateRepository.findById(checkId).isPresent()) {
            rateRepository.save(new Rate(new RateId(userId, postId), true));
            postRepository.findById(postId).get().setRating(postRepository.findById(postId).get().getRating()+1);
            postRepository.save(postRepository.findById(postId).get());
        } else if (rateRepository.findById(checkId).isPresent() && !rateRepository.findById(checkId).get().isPlusOrMinus()) {
            rateRepository.findById(checkId).get().setPlusOrMinus(true);
            postRepository.findById(postId).get().setRating(postRepository.findById(postId).get().getRating()+2);
            postRepository.save(postRepository.findById(postId).get());
        }
    }

    @Override
    public void rateMinus(Long postId, Long userId) {
        RateId checkId = new RateId(userId, postId);
        if (!rateRepository.findById(checkId).isPresent()) {
            rateRepository.save(new Rate(new RateId(userId, postId), false));
            postRepository.findById(postId).get().setRating(postRepository.findById(postId).get().getRating()-1);
            postRepository.save(postRepository.findById(postId).get());
        } else if (rateRepository.findById(checkId).isPresent() && rateRepository.findById(checkId).get().isPlusOrMinus()) {
            rateRepository.findById(checkId).get().setPlusOrMinus(false);
            postRepository.findById(postId).get().setRating(postRepository.findById(postId).get().getRating()-2);
            postRepository.save(postRepository.findById(postId).get());
        }
    }
}
