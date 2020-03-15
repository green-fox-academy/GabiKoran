package com.greenfoxacademy.reddit.models.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RateId implements Serializable {
    private Long userId;
    private Long postId;

    public RateId() {
    }

    public RateId(Long userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
