package com.banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount account = new BankAccount(200);
        boolean result = account.withdraw(100);

        assertTrue(result);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawFail() {
        BankAccount account = new BankAccount(100);
        boolean result = account.withdraw(200);

        assertFalse(result);
        assertEquals(100, account.getBalance());
    }
}
