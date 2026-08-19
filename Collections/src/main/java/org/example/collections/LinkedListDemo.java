package org.example.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static  void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Preethi");
        list.add(30);
        list.add(null);
        list.add("Preethi");
        System.out.println(list);
        list.set(0, "software");
        System.out.println(list);
        list.add(0, "Gyan");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.addFirst("GPrakash");
        System.out.println(list);
    }
}
