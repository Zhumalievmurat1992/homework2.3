package com.company;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        // double amount=getAmount()+sum;
        amount += sum;
        System.out.println(" vy popolnili balans " + sum + " vash balans " + getAmount());

    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException(" ne dostatochno sredstv ", getAmount());
        } else {
            amount -= sum;
            System.out.println(" vy snyli so cheta " + sum);
        }
    }
}
