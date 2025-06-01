package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(700.00);
    }

    @Test
    public void testDeposit() {
        account.deposit(200);
        assertEquals(900.00, account.getBalance(), "New balance is $900");
    }

    @Test
    public void testWithdrawal() {
        account.withdrawal(200.00);
        assertEquals(500.00, account.getBalance(), "New balance is $500");
    }

    @Test
    public void testInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdrawal(800.00);
        });
        assertEquals("Error: Insufficient Funds", exception.getMessage());
    }

    @Test
    void testZeroDeposit() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
    }
}
