package com.truongpq.lab9.ex2;

/**
 * Created by truongpq on 30/11/2015.
 */
public class GenericListTest {
    public static void main(String[] args) {
        testInteger();
        testString();
    }

    public static void testInteger() {
        GenericList<Integer> genericList = new GenericList<Integer>();
        genericList.insertLast(1);
        genericList.insertLast(2);
        genericList.insertLast(3);
        genericList.insertBefore(new Node(1), 0);
        System.out.println(genericList);
        genericList.remove(new Node(1));
        System.out.println(genericList);
    }

    public static void testString() {
        GenericList<String> genericList = new GenericList<String>();
        genericList.insertLast("Truong1");
        genericList.insertLast("Truong2");
        genericList.insertLast("Truong3");
        genericList.insertBefore(new Node("Truong1"), "Truong0");
        System.out.println(genericList);
        genericList.remove(new Node("Truong1"));
        System.out.println(genericList);
    }

}
