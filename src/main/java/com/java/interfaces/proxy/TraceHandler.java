package com.java.interfaces.proxy;

import java.lang.reflect.Method;

public class TraceHandler {

    private Object target;

    /**
     * Tworzy obiekt TraceHandler.
     * @param t parametr niejawny wywołania metody
     */
    public TraceHandler(Object t)
    {
        target = t;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable
    {
        // Drukowanie argumentu niejawnego.
        System.out.print(target);
        // Drukowanie nazwy metody.
        System.out.print("." + m.getName() + "(");
        // Drukowanie argumentów jawnych.
        if (args != null)
        {
            for (int i = 0; i < args.length; i++)
            {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");

        // rzeczywiste wywołanie metody
        return m.invoke(target, args);
    }
}
