package com.truongpq.lab9.ex3;

import java.util.ArrayList;

/**
 * Created by truongpq on 30/11/2015.
 */
public class Arrays {
    public static <T extends Comparable> void sort(T[] arr) {
        for (int  i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) == -1) {
                    T t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
