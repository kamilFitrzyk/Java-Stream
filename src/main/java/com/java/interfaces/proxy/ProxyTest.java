package com.java.interfaces.proxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {
    public static void run(String[] args)
    {
        var elements = new Object[1000];

        // Wstawienie do tablicy obiektów pośredniczących liczb całkowitych z przedziału 1 - 1000.
        for (int i = 0; i < elements.length; i++)
        {
            Integer value = i + 1;
            TraceHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[] { Comparable.class } , handler);
            elements[i] = proxy;
        }

        // Tworzenie losowej liczby całkowitej.
        Integer key = new Random().nextInt(elements.length) + 1;

        // Szukanie liczby.
        int result = Arrays.binarySearch(elements, key);

        // Drukowanie dopasowanej wartości, jeśli zostanie znaleziona.
        if (result >= 0) System.out.println(elements[result]);
    }
}
