package com.briup.day.day9.Test.Bank;

public class Bank {

    Customer[] customers;
    int custNum;

    public Bank() {
        customers = new Customer[100];
    }
    public void addCustomer(Customer customer) {
        this.customers[custNum] = customer;
        custNum++;
    }

    public Customer getCustomers(int index) {
        return customers[index];
    }

    public int getCustomersNum() {
        return custNum;
    }
}
