package com.briup.day.day9.Test.Bank;

public class SavingAccount extends Account{

    double rate;

    public SavingAccount(double balance, double rate) {
        super(balance * (1 + rate/100));
        this.rate = rate;
    }

}
