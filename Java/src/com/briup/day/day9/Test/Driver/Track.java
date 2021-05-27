package com.briup.day.day9.Test.Driver;

public class Track {

    String title;
    Duration duration;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String toString() {
        return "my Track address is: " + title + " duration is: " + duration;
    }
}
