package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = sum;
    }

    public void withDraw(int sum)
         throws LimitException {
            if (sum > amount) {

                throw new LimitException("Ваша сумма меньше остатка. ", amount);
            }
        System.out.println(amount = amount - sum);
        }
    }
