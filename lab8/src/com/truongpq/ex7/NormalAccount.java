package com.truongpq.ex7;

/**
 * Created by truongpq on 17/11/2015.
 */
public class NormalAccount extends Account {
    public NormalAccount(double balance) throws InvalidAmountException {
        super(balance);
    }

    public double endMonthCharge() {
        return 10000;
    }

}
