package com.company;

/**
 * Created by krzysztofgrys on 4/24/17.
 */
public class Issue {
    private String title;
    private int priority;

    public Issue(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
