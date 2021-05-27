package com.briup.day.day21.day21.Account;

public class CustomerThread extends Thread{

    private Account account;
    private double cunBalance;
    private double quBalance;

    public CustomerThread() {}
    public CustomerThread(String name, Account account, double balance) {
        super(name);
        this.account = account;
        if (name.equals("存钱中心")) {
            this.cunBalance = balance;
        }
        if (name.equals("取钱中心")) {
            this.quBalance = balance;
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("存钱中心")) {
            cun();
        }
        if (Thread.currentThread().getName().equals("取钱中心")) {
            qu();
        }
    }

    private synchronized void cun() {
        if (account.saveMoney(cunBalance)) {
            System.out.println(getName() + "从" + account.getName() + "账号中， 存了" + cunBalance + ", 卡中剩余：" + account.getBalance());
        } else {
            System.out.println("存储失败");
        }
    }

    private synchronized void qu() {
        if (account.withdrawMoney(quBalance)) {
            System.out.println(getName() + "从" + account.getName() + "账号中， 取了" + quBalance + ", 卡中剩余：" + account.getBalance());
        } else {
            System.out.println("取钱失败");
        }
    }

}
