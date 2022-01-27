package com.exercise.helloWorldSpring;

public class HelloWorldRest {
    private final long id;
    private final String content;

    public HelloWorldRest(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
