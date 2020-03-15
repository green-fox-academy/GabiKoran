package com.greenfoxacademy.reddit.services;

public interface RateService {

    void ratePlus(Long postId, Long userId);

    void rateMinus(Long postId, Long userId);
}
