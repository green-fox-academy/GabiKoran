package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.entities.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.findAllPostsOrderByVotesDesc());
        return "index";
    }

    @GetMapping("/submit")
    public String renderSubmitNewPost() {
        return "submit";
    }

    @PostMapping("/submit")
    public String submitNewPost(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/";
    }
}
