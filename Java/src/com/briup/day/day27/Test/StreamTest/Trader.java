package com.briup.day.day27.Test.StreamTest;

public class Trader {

    private String name;
    private String address;

    public Trader() {}
    public Trader(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
