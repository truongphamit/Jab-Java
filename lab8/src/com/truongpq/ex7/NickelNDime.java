package com.truongpq.ex7;

/**
 * Created by truongpq on 17/11/2015.
 */
public class NickelNDime extends Account {
    public NickelNDime(double balance) throws InvalidAmountException {
        super(balance);
    }

    @Override
    protected double endMonthCharge() {
        return count * 2000;
    }
}
