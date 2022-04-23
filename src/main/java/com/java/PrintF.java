package com.java;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Date;
import java.util.Formattable;
import java.util.Formatter;

public class PrintF {

    public static void run() throws IOException {



        Double d = 10000.0 / 3.0 ;
        System.out.println(d);
        System.out.printf("%8.2f", d);

        String name = "kamil";
        int age = 42;

        System.out.printf("\nWitaj, %s. W przyszłym roku będziesz miać lat %d", name, age);

        System.out.printf("\n%, .3f", d);
        System.out.printf("\n%, .2f", -d);


        String message = String.format("\nWitaj, %s. W przyszłym roku będziesz miać lat %d", name, age);


        System.out.printf("\n%tB", new Date());
        System.out.printf("\n%tc", new Date());








    }


}
