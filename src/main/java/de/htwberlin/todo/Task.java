package de.htwberlin.todo;

public class Task {

    private Long id;
    private String title;
    private boolean done;

    public Task(Long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isDone() { return done; }
}