package com.java.collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

    public static void run() {
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Ania");
        staff.add("Bartek");
        staff.add("Karol");
        Iterator<String> iter = staff.iterator();
        String first = iter.next();
        String second = iter.next();
        iter.remove();


        LinkedList<String> a = new LinkedList<>();
        a.add("Ania");
        a.add("Karol");
        a.add("Eryk");

        LinkedList<String> b = new LinkedList<>();
        b.add("Bartek");
        b.add("Daniel");
        b.add("Franek");
        b.add("Gosia");

        //Scalanie list a i b

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.listIterator();

        while(bIter.hasNext()) {
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        //Usuniecie co drugiego slowa z listy b

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);

    }
}
