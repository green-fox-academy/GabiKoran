package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.entities.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findAllByOrderByVotesDesc();
}

