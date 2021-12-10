package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        bankAccount.deposit(25000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                double ostatok=bankAccount.getAmount();
                try {
                    bankAccount.withDraw((int) ostatok);
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }

        }

    }
}
