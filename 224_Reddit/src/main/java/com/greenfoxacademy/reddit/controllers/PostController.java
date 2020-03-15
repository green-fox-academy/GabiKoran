package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.Post;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.RateService;
import com.greenfoxacademy.reddit.services.UserService;
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
    private UserService userService;
    private RateService rateService;

    @Autowired
    public PostController(PostService postService, UserService userService, RateService rateService) {
        this.postService = postService;
        this.userService = userService;
        this.rateService = rateService;
    }

    @GetMapping("/{userid}/p1")
    public String listPostsPage1(Model model, @PathVariable Long userid) {
        model.addAttribute("userid", userid);
        model.addAttribute("user", userService.findById(userid));
        model.addAttribute("posts", postService.page001());
        return "page1";
    }

    @GetMapping("/{userid}/p2")
    public String listPostsPage2(Model model, @PathVariable Long userid) {
        model.addAttribute("userid", userid);
        model.addAttribute("user", userService.findById(userid));
        model.addAttribute("posts", postService.page002());
        return "page2";
    }

    @GetMapping("/{userid}/p3")
    public String listPostsPage3(Model model, @PathVariable Long userid) {
        model.addAttribute("userid", userid);
        model.addAttribute("user", userService.findById(userid));
        model.addAttribute("posts", postService.page003());
        return "page3";
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
        return "redirect:/" + userid + "/p1";
    }

    @PostMapping("/{userid}/{postid}/plus")
    public String incrementRating(@ModelAttribute(name = "postid") Long postid, @PathVariable Long userid) {
        rateService.ratePlus(postid, userid);
//        postService.incrementRating(postid);
        return "redirect:/" + userid + "/p1";
    }

    @PostMapping("/{userid}/{postid}/minus")
    public String decrementRating(@ModelAttribute(name = "postid") Long postid, @PathVariable Long userid) {
        rateService.rateMinus(postid, userid);
//        postService.decrementRating(postid);
        return "redirect:/" + userid + "/p1";
    }
}
