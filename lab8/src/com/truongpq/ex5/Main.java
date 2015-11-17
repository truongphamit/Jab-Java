package com.truongpq.ex5;

/**
 * Created by truongpq on 16/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception{
        someMethod2();
    }

    public static void someMethod2() throws Exception{
        throw new Exception("Exception");
    }
}
