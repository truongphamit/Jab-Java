package com.truongpq.ex7;

/**
 * Created by truongpq on 17/11/2015.
 */
public class OverWithdrawException extends InvalidAmountException {
    public OverWithdrawException() {
        super("OverWithdrawException");
    }

    public OverWithdrawException(String message) {
        super(message);
    }
}
