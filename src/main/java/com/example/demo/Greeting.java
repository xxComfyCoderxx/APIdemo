package com.example.demo;

public class Greeting {

    private final long id;
    private final String content;
    private final String details;

    public Greeting(long id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getDetails() {
        return details;
    }
}
