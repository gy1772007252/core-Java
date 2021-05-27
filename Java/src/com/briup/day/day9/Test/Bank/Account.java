package com.briup.day.day9.Test.Bank;

public class Account {

    double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public boolean deposit(double amount) {
        this.balance += amount;
        System.out.println("成功存入：" + amount + "元，当前账务余额为" + balance + "元。");
        return true;
    }
    public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("成功取出：" + amount + "元，当前账务余额为" + balance + "元。");
            return true;
        } else {
            System.out.println("取出失败！当前余额不足！");
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }

}
