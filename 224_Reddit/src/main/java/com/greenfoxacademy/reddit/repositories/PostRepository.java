package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.PageRequest;
import com.greenfoxacademy.reddit.models.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

    Page<Post> findAllByOrderByRatingDesc(Pageable pageable);

}

