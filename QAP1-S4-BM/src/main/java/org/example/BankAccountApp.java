package org.example;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        System.out.println();
        System.out.println("Java Bank");
        while (account == null) {
            System.out.println();
            System.out.println("New account; initial deposit: ");
            double startingBalance = scanner.nextDouble();

            try {
                account = new BankAccount(startingBalance);
                System.out.println("New Account Balance: $ " + String.format("%.2f", startingBalance));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        boolean running = true;
        while(running){
            System.out.println();
            System.out.println("\nSelect one of the following options:");
            System.out.println("(1) Deposit Funds");
            System.out.println("(2) Withdraw Funds");
            System.out.println("(3) Check Balance");
            System.out.println("(4) Complete/Exit");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    try{
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful --- $" + String.format("%.2f", depositAmount)+ " \n * NEW Balance * --- $" + String.format("%.2f", account.getBalance()));
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Withdrawal Amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    try{
                        account.withdrawal(withdrawalAmount);
                        System.out.println("Withdraw sum of --- $" + String.format("%.2f",withdrawalAmount) + "\n * NEW balance * --- $" + String.format("%.2f", account.getBalance()));
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + String.format("%.2f", account.getBalance()));
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for choosing Java Bank");
            }
        }
        scanner.close();
    }
}