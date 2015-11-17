package com.truongpq.ex2;

import java.io.IOException;

/**
 * Created by truongpq on 16/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            secondMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            thirdMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fourthMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void firstMethod() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void secondMethod() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void thirdMethod() throws NullPointerException {
        throw new NullPointerException("NullPointerException");
    }

    public static void fourthMethod() throws IOException {
        throw new IOException("IOException");
    }
}
