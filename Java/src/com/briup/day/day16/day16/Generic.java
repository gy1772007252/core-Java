package com.briup.day.day16.day16;

public class Generic<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

}
