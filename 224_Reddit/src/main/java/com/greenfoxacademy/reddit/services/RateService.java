package com.greenfoxacademy.reddit.services;

public interface RateService {

    void rate(Long postId, Long userId, Integer ratingValue);
}
