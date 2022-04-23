package com.java;

import java.math.BigDecimal;
import java.util.Arrays;

public class Variable {

    public static void run() {


        Integer hex = 0xAE01; //44545

        Integer number8 = 0432; //282

        Integer numberBinary = 0b1111_0100_0010_0100_0000; //1000000
        Float numberFloat = 3.14F;
        Double numberDouble = 3.14; //  Double numberDouble = 3.14D;

        System.out.println(hex);
        System.out.println(number8);
        System.out.println(numberBinary);

        System.out.println(Double.isNaN(numberDouble));
        System.out.println(Double.NaN);


        //String

        System.out.println(String.join(" / ", "M", "S", "D", "X"));
        System.out.println("Java".repeat(10));

        String greeting = "Cześć";
        greeting = greeting.substring(0, 3) + "kaj";
        System.out.println(greeting);

        greeting.equals("Cześć");
        greeting.equalsIgnoreCase("Cześć");


        if (greeting.length() == 0){}

        if (greeting.equals("")){}

        if (greeting == null){}

        if (greeting != null && greeting.length() != 0){}

        char first = greeting.charAt(0);

        greeting.trim();//usuwa białe znaki z poczatku
        greeting.strip();//usuwa białe znaki z konca

        StringBuilder builder = new StringBuilder();

        builder.append("k");
        builder.append("a");
        builder.append("m");
        builder.append("i");
        builder.append("l");

        String completedString = builder.toString();
        System.out.println(completedString);

        System.out.println(BigDecimal.TEN);
        System.out.println(BigDecimal.ZERO);

        BigDecimal a =  BigDecimal.valueOf(10000);
        BigDecimal b =  BigDecimal.valueOf(20000);
        BigDecimal c = a.add(b);
        BigDecimal d = c.multiply(b.add(BigDecimal.valueOf(2)));
        System.out.println(d);

        System.out.println(a.compareTo(b));

        int[] table = new int[5];
        System.out.println(table[0]);

        boolean[] booleansTable = new boolean[3];
        System.out.println(booleansTable[0]);

        String[] names = new String[10];
        System.out.println(names[0]);

        System.out.println(table.length);
        System.out.println(names.length);

        for (int element : table) System.out.println(element);
        System.out.println(Arrays.toString(table));

        int[] smallPrimes = { 4, 6, 2, 6, 7};
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[1] = 12;
        System.out.println(smallPrimes[1]);
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);



    }

}
