package com.truongpq.ex4;

/**
 * Created by truongpq on 16/11/2015.
 */
public class Main {
    public static void main(String[] ags) {
        try {
            new SomeException();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
