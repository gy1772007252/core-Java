package com.briup.day.day9.Test.Driver;

public class Duration {

    int hours, minutes, seconds;

    public Duration(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Duration(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = seconds / 60 - hours * 60;
        this.seconds = seconds - hours * 3600 - minutes * 60;
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public int getTotalSeconds() {
        int sum = 0;
        sum = hours * 3600 + minutes * 60 + seconds;
        return sum;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
