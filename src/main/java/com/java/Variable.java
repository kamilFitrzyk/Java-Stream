package com.java;

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


    }

}
