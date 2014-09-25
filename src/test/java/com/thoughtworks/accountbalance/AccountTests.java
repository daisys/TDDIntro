package com.thoughtworks.accountbalance;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class AccountTests {

    private final Account account = new Account(100);

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        assertThat(account.deposit(50), is(150));

    }


    private final Account account2 = new Account(100);

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        assertThat(account2.withdraw(50), is(50));

    }

    private final Account account3 = new Account(100);
    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        assertThat(account3.withdraw(200), is(100));

    }
}
