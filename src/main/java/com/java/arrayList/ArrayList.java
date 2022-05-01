package com.java.arrayList;

public class ArrayList {

    public static void run() {
        java.util.ArrayList<Integer> array = new java.util.ArrayList<>();
        array.ensureCapacity(10); // Or  ArrayList<Integer> array = new ArrayList<>(8);
        array.add(4);
        array.add(5);
        array.add(7);
        array.add(1);
        array.add(10);
        array.add(9);
        array.add(8);
        array.add(7);

        array.set(8, 10);
        System.out.println(array.size());

        array.trimToSize();

        int n = array.size()/2;
        array.add(5, n);
        array.remove(n);
    }
}
