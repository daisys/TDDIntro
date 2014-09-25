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
        return balance + i;
    }

    public int withdraw(int i) {
        if ((balance - i) < 0) {
            return balance;
        } else {
            return balance - i;
        }
    }
}
