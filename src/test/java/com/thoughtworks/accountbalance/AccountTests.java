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


    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        assertThat(account.withdraw(50), is(50));

    }
//
//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
