package com.greenfoxacademy.reddit.models.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Rate {

    @EmbeddedId
    private RateId rateId;
    private int ratingValue;

    public Rate() {
    }

    public Rate(RateId rateId) {
        this.rateId = rateId;
    }

    public Rate(RateId rateId, int ratingValue) {
        this.rateId = rateId;
        this.ratingValue = ratingValue;
    }

    public RateId getRateId() {
        return rateId;
    }

    public void setRateId(RateId rateId) {
        this.rateId = rateId;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        if (ratingValue == 1 || ratingValue == -1) {
            this.ratingValue = ratingValue;
        }
    }
}
