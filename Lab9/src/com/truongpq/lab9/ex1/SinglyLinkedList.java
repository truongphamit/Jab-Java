package com.truongpq.lab9.ex1;

/**
 * Created by truongpq on 30/11/2015.
 */
public class SinglyLinkedList {
    protected Node head;
    private int count = 0;

    public SinglyLinkedList() {
        head = null;
        count = 0;
    }

    public boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }

    public Node first() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }
        return head;
    } // trả về nút đứng đầu danh sách

    public Node last() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    } // trả về nút đứng cuối danh sách

    public Node next(Node n) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getData().equals(n.getData())) {
                return current.getNext();
            }
            current = current.getNext();
        }
        if (current != null && current.getData().equals(n.getData())) {
            System.out.println("Node is Last Node");
            return null;
        }
        System.out.println("Node doesn't exist");
        return null;
    } // trả về nút liền sau n

    public Node prev(Node n) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }
        Node current = head;
        Node pre = head;
        while (current.getNext() != null) {
            if (current.getData().equals(n.getData())) {
                if (pre == head) {
                    System.out.println("Node is First Node");
                    return null;
                } else {
                    return pre;
                }
            }
            pre = current;
            current = current.getNext();
        }

        if (current != null && current.getData().equals(n.getData())) {
            return pre;
        }

        System.out.println("Node doesn't exist");
        return null;
    } // trả về nút liền trước n

    public String remove(Node n) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }

        if (n == null) {
            System.out.println("Node is null");
            return null;
        }

        Node current = head;
        Node pre = current;
        while (current.getNext() != null) {
            if (current.getData().equals(n.getData())) {
                if (current == head) {
                    head = current.getNext();
                    --count;
                    return current.getData();
                }
                String data = current.getData();
                pre.setNext(current.getNext());
                --count;
                return data;
            }
            pre = current;
            current = current.getNext();
        }
        if (current != null && current.getData().equals(n.getData())) {
            if (count == 1) head = null;
            pre.setNext(null);
            --count;
            return current.getData();
        }
        System.out.println("Node doesn't exist");
        return null;
    }

    public Node insertAfter(Node n, String t) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }

        if (n == null) {
            System.out.println("Node is null");
            return null;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getData().equals(n.getData())) {
                current.setNext(new Node(t, current.getNext()));
                ++count;
                return current.getNext();
            }
            current = current.getNext();
        }

        if (current != null && current.getData().equals(n.getData())) {
            current.setNext(new Node(t));
            ++count;
            return  current.getNext();
        }
        System.out.println("Node doesn't exist");
        return null;
    }

    public Node insertBefore(Node n, String t) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return null;
        }

        if (n == null) {
            System.out.println("Node is null");
            return null;
        }

        Node current = head;
        Node pre = current;
        while (current.getNext() != null) {
            if (current.getData().equals(n.getData())) {
                if (current == head) {
                    return insertFirst(t);
                }
                pre.setNext(new Node(t, current));
                ++count;
                return pre.getNext();
            }
            pre = current;
            current = current.getNext();
        }

        if (current != null && current.getData().equals(n.getData())) {
            pre.setNext(new Node(t, current));
            ++count;
            return  pre.getNext();
        }
        System.out.println("Node doesn't exist");
        return null;

    }

    public Node insertFirst(String t) {
        if (isEmpty()) {
            head = new Node(t);
            ++count;
            return head;
        }
        Node current = head;
        head = new Node(t);
        head.setNext(current);
        ++count;
        return head;
    }

    public Node insertLast(String t) {
        if (isEmpty()) {
            head = new Node(t);
            ++count;
            return head;
        } else {
            Node current = head;
            Node pre = current;
            while (current.getNext() != null) {
                pre = current;
                current = current.getNext();
            }
            current.setNext(new Node(t));
            ++count;
            return current.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node p = head;
        while (p != null) {
            stringBuilder.append(p.getData() + ", ");
            p = p.getNext();
        }
        return stringBuilder.toString();
    }
}
