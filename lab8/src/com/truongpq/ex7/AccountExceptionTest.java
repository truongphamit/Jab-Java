package com.truongpq.ex7;

/**
 * Created by truongpq on 17/11/2015.
 */
public class AccountExceptionTest {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        try {
            accounts[0] = new NormalAccount(100000);
            accounts[1] = new NickelNDime(100000);
            accounts[2] = new Gambler(100000);

            accounts[0].deposit(100000);
            accounts[1].deposit(100000);
            accounts[2].deposit(100000);

            accounts[0].withdraw(10);
            accounts[1].withdraw(10);
            accounts[2].withdraw(10);

            accounts[0].endMonth();
            accounts[1].endMonth();
            accounts[2].endMonth();

        } catch (InvalidAmountException e) {
            e.printStackTrace();
        }
    }
}
