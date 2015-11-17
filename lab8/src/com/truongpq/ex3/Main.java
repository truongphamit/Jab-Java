package com.truongpq.ex3;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method() throws IOException {
        throw new IOException();
    }
}
