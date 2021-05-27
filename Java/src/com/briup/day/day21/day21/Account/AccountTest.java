package com.briup.day.day21.day21.Account;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account("123456", 1000);
        Thread t1 = new CustomerThread("存钱中心", account, 1000);
        Thread t2 = new CustomerThread("取钱中心", account, 1000);
        t1.start();
        t2.start();

    }

}
