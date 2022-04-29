package com.java.enumTest;

import java.util.Scanner;

public class EnumTest {

    public static void run() {
        var in = new Scanner(System.in);
        System.out.print("Podaj rozmiar: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("rozmiar=" + size);
        System.out.println("skr�t=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Dobra robota -- nie pomin��e� znaku podkre�lenia _.");
    }
}
