package com.truongpq.ex6;

import java.io.IOException;

/**
 * Created by truongpq on 16/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method() throws IOException{
        try {
            Object array[] = new Object[5];
            System.out.print(array[0]);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        method1();
    }

    public static void method1() throws IOException {
        throw new IOException();
    }
}
