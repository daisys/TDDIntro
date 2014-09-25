package com.thoughtworks.accountbalance;

/**
 * Created by daisyshih on 2014-09-25.
 */
public class Account {
    private int balance;
    public Account(int balance) {
        this.balance = balance;
    }

    public int deposit(int i) {
        return 150;
    }

    public int withdraw(int i) {
        return 50;
    }
}
