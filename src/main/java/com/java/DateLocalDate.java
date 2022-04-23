package com.java;

import java.time.LocalDate;
import java.util.Date;

public class DateLocalDate {

    public static void run() {
        Date d = new Date();
        System.out.println(d);

        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);

        LocalDate localDateOf = LocalDate.of(1999, 5, 19);
        System.out.println(localDateOf);
        System.out.println(localDateOf.getDayOfMonth());
        System.out.println(localDateOf.getYear());

        LocalDate localPlus100Days = localDateOf.plusDays(100);
        System.out.println(localPlus100Days);


    }
}
