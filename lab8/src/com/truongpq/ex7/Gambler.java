package com.truongpq.ex7;

import java.util.Random;

/**
 * Created by truongpq on 17/11/2015.
 */
public class Gambler extends Account {
    public Gambler(double balance) throws InvalidAmountException {
        super(balance);
    }

    @Override
    public void endMonth() {
        System.out.println("Balance: " + balance);
    }

    @Override
    public boolean withdraw(double amount) throws OverWithdrawException {
        Random rand = new Random();
        int x = rand.nextInt(100);
        if (x <= 51) {
            if (amount >= balance/2) {
                throw new OverWithdrawException();
            }
            super.withdraw(amount);
            return true;
        } else {
            if (amount >= balance/2) {
                throw new OverWithdrawException();
            }
            super.withdraw(2 * amount);
            return true;
        }
    }

    @Override
    protected double endMonthCharge() {
        return 0;
    }
}
