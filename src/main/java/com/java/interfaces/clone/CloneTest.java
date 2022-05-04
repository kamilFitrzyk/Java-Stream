package com.java.interfaces.clone;

import java.util.Arrays;

public class CloneTest  {
    public static void run() throws CloneNotSupportedException {

        int[] luckyNumber = {4, 6, 2, 7, 8};
        int[] cloned = luckyNumber.clone();
        cloned[2] = 10;
        for ( var c : luckyNumber ) {
            System.out.print(c + " ");
        }
        for ( var c : cloned ) {
            System.out.print(c + " ");
        }

        System.out.println("\n");
        var original = new Employee("Stefan Gąbek", 2000);
        original.setHireDay(2000,5,1);

        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002,5,1);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
