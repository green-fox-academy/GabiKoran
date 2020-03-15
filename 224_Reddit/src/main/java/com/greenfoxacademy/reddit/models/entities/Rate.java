package com.greenfoxacademy.reddit.models.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Rate {

    @EmbeddedId
    private RateId rateId;

    private boolean isPlusOrMinus;

    public Rate() {
    }

    public Rate(RateId rateId) {
        this.rateId = rateId;
    }

    public Rate(RateId rateId, boolean isPlusOrMinus) {
        this.rateId = rateId;
        this.isPlusOrMinus = isPlusOrMinus;
    }

    public RateId getRateId() {
        return rateId;
    }

    public void setRateId(RateId rateId) {
        this.rateId = rateId;
    }

    public boolean isPlusOrMinus() {
        return isPlusOrMinus;
    }

    public void setPlusOrMinus(boolean plusOrMinus) {
        isPlusOrMinus = plusOrMinus;
    }
}
