package com.briup.day.day27.Test.StreamTest;

public class Transaction {

    private String name;
    private int year;
    private double amount;

    public Transaction() {}
    public Transaction(String name, int year, double amount) {
        this.name = name;
        this.year = year;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }

}
