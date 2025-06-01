package org.example;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        if (initialBalance >= 0){
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Error: Balance cannot be negative");
        }
    }
    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Error: Invalid deposit amount");
        }
        this.balance += amount;
    }
    public void withdrawal(double amount){
        if (amount > this.balance){
            throw new IllegalArgumentException("Error: Insufficient Funds");
        }else if (amount > 0) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Error: Invalid withdrawal amount");
        }
    }
    public double getBalance(){
        return balance;
    }
}
