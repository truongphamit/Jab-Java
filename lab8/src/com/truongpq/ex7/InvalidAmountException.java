package com.truongpq.ex7;

/**
 * Created by truongpq on 17/11/2015.
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super("InvalidAmountException");
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}
