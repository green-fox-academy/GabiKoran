package com.greenfoxacademy.frontend.models;

public class Appenda {

    private String appendable;
    private String appended;

    public Appenda() {
        StringBuilder append = new StringBuilder();
        this.appendable = append.toString();
        this.appended = append.append('a').toString();
    }

    public Appenda(String appendable) {
        this.appendable = appendable;
        this.appended = appendable + 'a';
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
