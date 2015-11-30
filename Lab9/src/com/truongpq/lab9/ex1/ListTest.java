package com.truongpq.lab9.ex1;

/**
 * Created by truongpq on 30/11/2015.
 */
public class ListTest {
    public static void main(String[] args) {
        testString();
    }

    public static void testString() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        //singlyLinkedList.insertFirst("Test");
        //singlyLinkedList.insertLast("Test");
        //singlyLinkedList.insertBefore(new Node("Value"), "Test");
        //singlyLinkedList.insertAfter(new Node("Value"), "Test");
        //singlyLinkedList.remove(new Node("Test"));
        //singlyLinkedList.first();
        //singlyLinkedList.last();
        //singlyLinkedList.next(new Node("Test"));
        //singlyLinkedList.prev(new Node("Test"));

        singlyLinkedList.insertLast("Test1");
        singlyLinkedList.insertLast("Test2");
        singlyLinkedList.insertLast("Test3");

        //singlyLinkedList.remove(null);
        //singlyLinkedList.remove(new Node("Test1"));
        //singlyLinkedList.remove(new Node("Test2"));
        //singlyLinkedList.remove(new Node("Test3"));

        //singlyLinkedList.insertAfter(null, "Test0");
        //singlyLinkedList.insertAfter(new Node("Test1"), "Test0");
        //singlyLinkedList.insertAfter(new Node("Test3"), "Test0");
        //singlyLinkedList.insertAfter(new Node("Test4"), "Test0");

        //singlyLinkedList.insertBefore(null, "Test0");
        //singlyLinkedList.insertBefore(new Node("Test1"), "Test0");
        //singlyLinkedList.insertBefore(new Node("Test3"), "Test0");
        //singlyLinkedList.insertAfter(new Node("Test4"), "Test0");

        System.out.println(singlyLinkedList);
    }

}
