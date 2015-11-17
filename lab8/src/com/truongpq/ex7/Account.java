package com.truongpq.ex7;

public abstract class Account {
    protected double balance;
    protected int count;

    public Account(double balance) throws InvalidAmountException {
        if (balance <= 0) throw new InvalidAmountException();
        this.balance = balance;
    }

    public boolean deposit(int amount) throws InvalidAmountException {
        if (amount <= 0 || amount > balance) {
            throw new InvalidAmountException();
        }
        balance += amount;
        ++count;
        return true;
    }

    public boolean withdraw(double amount) throws OverWithdrawException {
        if (amount <= 0 || amount > balance) {
            throw new OverWithdrawException();
        }
        balance -= amount;
        ++count;
        return true;
    }

    public void endMonth() throws OverWithdrawException {
        if (endMonthCharge() > balance) throw new OverWithdrawException();
        balance -= endMonthCharge();
        System.out.println("Balance: " + balance);
        System.out.println("Count: " + count);
        System.out.println("Cost: " + endMonthCharge());
        count = 0;
    }

    protected abstract double endMonthCharge();

}
