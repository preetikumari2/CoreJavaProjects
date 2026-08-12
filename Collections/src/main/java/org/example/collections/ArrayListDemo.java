package org.example.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add(String.valueOf(10));
        arrayList.add("B");
        arrayList.add(null);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.add(2, "M");
        arrayList.add("N");
        System.out.println(arrayList);
    }
}
