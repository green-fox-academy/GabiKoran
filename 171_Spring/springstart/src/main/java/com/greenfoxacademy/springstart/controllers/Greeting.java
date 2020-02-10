package com.greenfoxacademy.springstart.controllers;

public class Greeting {

    long greetCount;
    String content;

    public Greeting(long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }
}
