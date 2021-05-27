package com.briup.day.day9.Test.Bank;

public class CheckingAccount extends Account{

    double overdraft;

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = overdraft;
    }
    public CheckingAccount(double balance) {
        super(balance);
    }
    public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("成功取出：" + amount + "元，当前账务余额为" + balance + "元，透支额度为" + overdraft + "元。");
            return true;
        } else if (this.balance + overdraft >= amount) {
            if (this.balance == 0){
                this.overdraft -= amount;
                System.out.println("成功取出：" + amount + "元，当前账务余额为" + balance + "元，透支额度为" + overdraft + "元。");
                return true;
            } else {
                System.out.print("成功取出：" + amount + "元，当前账务余额为");
                amount -= this.balance;
                this.balance = 0;
                this.overdraft -= amount;
                System.out.println(balance + "元，透支额度为" + overdraft + "元。");
                return true;
            }
        } else {
            System.out.println("取出失败！当前余额不足！");
            return false;
        }
    }
    public double getOverdraft() {
        return overdraft;
    }

}
