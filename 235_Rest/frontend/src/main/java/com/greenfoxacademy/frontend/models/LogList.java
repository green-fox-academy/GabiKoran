package com.greenfoxacademy.frontend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogList {

    private List<Log> entries;
    @JsonProperty("entry_count")
    private int entryCount;

    public LogList() {
    }

    public LogList(List<Log> entries) {
        this.entries = entries;
        this.entryCount = entries.size();
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(int entryCount) {
        this.entryCount = entryCount;
    }
}
