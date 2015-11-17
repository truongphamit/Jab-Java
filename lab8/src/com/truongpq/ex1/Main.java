package com.truongpq.ex1;

/**
 * Created by truongpq on 16/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            secondMethod();
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }
    }

    public static void firstMethod() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void secondMethod() throws ExceptionC {
        throw new ExceptionC("Exception C");
    }
}
