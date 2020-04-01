package com.greenfoxacademy.frontend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logType;
    private LocalDate createdAt;
    private String endpoint;
    private String data;

    public Log() {
        createdAt = LocalDate.now();
    }

    public Log(String endpoint, String data) {
        this.endpoint = endpoint;
        this.data = data;
        createdAt = LocalDate.now();
    }

    public Log(String logType, String endpoint, String data) {
        this.logType = logType;
        this.endpoint = endpoint;
        this.data = data;
        createdAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
