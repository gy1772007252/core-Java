package com.briup.day.day9.Test.Bank;

public class Customer {

    String name;
    Account account;

    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Account getAccount() {
        return account;
    }
}
