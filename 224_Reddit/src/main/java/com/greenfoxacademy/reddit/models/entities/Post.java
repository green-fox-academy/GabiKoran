package com.greenfoxacademy.reddit.models.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private Integer rating;
    private LocalDate creationDate;
    @ManyToOne
    private User owner;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Rate> postRatings;

    public Post() {
        this.rating = 1;
        this.creationDate = LocalDate.now();
        this.postRatings = new ArrayList<>();
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.rating = 1;
        this.creationDate = LocalDate.now();
        this.postRatings = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
