package com.truongpq.lab9.ex3;

/**
 * Created by truongpq on 30/11/2015.
 */
public class Test {
    public static void main(String[] args) {
        String[] arr = {"Truong0", "Truong1", "Truong2", "Truong3", "Truong4"};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}
