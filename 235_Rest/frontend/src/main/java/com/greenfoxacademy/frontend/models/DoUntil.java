package com.greenfoxacademy.frontend.models;

public class DoUntil {

    private Integer until;

    public DoUntil(Integer until) {
        this.until = until;
    }

    public DoUntil() {
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i <= until; i++) {
            sum+= i;
        }
        return sum;
    }

    public int factor() {
        int factorial = 1;
        for (int i = 1; i <= until; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
