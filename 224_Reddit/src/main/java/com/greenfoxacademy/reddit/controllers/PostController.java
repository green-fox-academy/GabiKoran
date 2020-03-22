package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}/p1")
    public String listPostsPage1(Model model, @PathVariable Long id) {
        model.addAttribute("userid", id);
        model.addAttribute("posts", postService.page001());
        return "page1";
    }

    @GetMapping("/{id}/p2")
    public String listPostsPage2(Model model, @PathVariable Long id) {
        model.addAttribute("userid", id);
        model.addAttribute("posts", postService.page002());
        return "page2";
    }

    @GetMapping("/{id}/p3")
    public String listPostsPage3(Model model, @PathVariable Long id) {
        model.addAttribute("userid", id);
        model.addAttribute("posts", postService.page003());
        return "page3";
    }

    @GetMapping("/{id}/submit")
    public String renderSubmitNewPost(Model model, @PathVariable Long id) {
        model.addAttribute("userid", id);
        return "submit";
    }

    @PostMapping("/{id}/submit")
    public String submitNewPost(@ModelAttribute Post post, @PathVariable Long id) {
        postService.save(post);
        return "redirect:/" + id + "/p1";
    }

    @PostMapping("/{id}/plus")
    public String incrementRating(@ModelAttribute(name="id") Long id) {
        postService.incrementRating(id);
        return "redirect:/" + id + "/p1";
    }

    @PostMapping("/{id}/minus")
    public String decrementRating(@ModelAttribute(name="id") Long id) {
        postService.decrementRating(id);
        return "redirect:/" + id + "/p1";
    }
}
