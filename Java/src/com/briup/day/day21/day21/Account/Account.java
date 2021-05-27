package com.briup.day.day21.day21.Account;

public class Account {

    private String name;
    private double balance;

    public Account() {}
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized boolean saveMoney(double balance) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (balance <= 0) {
            System.out.println("输入金额不合规定！");
            return false;
        }
        double temp = this.balance;
        temp += balance;
        this.balance = temp;
        return true;
    }
    public synchronized boolean withdrawMoney(double balance) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (balance <= 0) {
            System.out.println("输入金额不合规定！");
            return false;
        }
        if (balance > this.balance) {
            System.out.println("输入金额大于存储金额！");
            return false;
        }
        double temp = this.balance;
        temp -= balance;
        this.balance = temp;
        return true;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

}
