package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.entities.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditAppApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditAppApplication (PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("These simulations show how to flatten the coronavirus growth curve", "https://www.washingtonpost.com/graphics/2020/world/corona-simulator/?fbclid=IwAR0SqkVRQCWN-GlbIkbnR3HCdSRYd2LBSicOgBQ74S5lZF_G6UfxlXd3Lq0"));
        postRepository.save(new Post("index", "https://index.hu/"));
    }
}
