package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.RateService;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;
    private RateService rateService;

    @Autowired
    public PostController(PostService postService, UserService userService, RateService rateService) {
        this.postService = postService;
        this.userService = userService;
        this.rateService = rateService;
    }

    @GetMapping("/{userid}")
    public String listPostsPage(Model model, @PathVariable Long userid, @RequestParam (required = false) Integer page) {
        model.addAttribute("userid", userid);
        model.addAttribute("user", userService.findById(userid));
        model.addAttribute("posts", postService.listPosts(page));
        model.addAttribute("page", page);
        model.addAttribute("pages", postService.pages());
        return "page";
    }

    @GetMapping("/{userid}/submit")
    public String renderSubmitNewPost(Model model, @PathVariable Long userid) {
        model.addAttribute("userid", userid);
        model.addAttribute("user", userService.findById(userid));
        return "submit";
    }

    @PostMapping("/{userid}/submit")
    public String submitNewPost(@ModelAttribute Post post, @PathVariable Long userid) {
        postService.save(post, userid);
        return "redirect:/" + userid + "?page=0";
    }

    @PostMapping("/{userid}/{postid}/rate")
    public String rate(@ModelAttribute(name = "postid") Long postId, @PathVariable(name = "userid")  Long userId, @ModelAttribute(name = "rateValue") int rateValue) {
        rateService.rate(postId, userId, rateValue);
        return "redirect:/" + userId;
    }
}
