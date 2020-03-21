package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.PageRequest;
import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
    public String listPostsPage1(Model model) {
        model.addAttribute("posts", postService.page001());
        return "page1";
    }

    @GetMapping("/2")
    public String listPostsPage2(Model model) {
        model.addAttribute("posts", postService.page002());
        return "page2";
    }

    @GetMapping("/3")
    public String listPostsPage3(Model model) {
        model.addAttribute("posts", postService.page003());
        return "page3";
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

    @PostMapping("/plus")
    public String incrementRating(@ModelAttribute(name="id") Long id) {
        postService.incrementRating(id);
        return "redirect:/";
    }

    @PostMapping("/minus")
    public String decrementRating(@ModelAttribute(name="id") Long id) {
        postService.decrementRating(id);
        return "redirect:/";
    }
}
