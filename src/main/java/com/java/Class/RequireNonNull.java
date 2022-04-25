package com.java.Class;

import java.util.Objects;

public class RequireNonNull {

    private String name;

    public RequireNonNull(String n) {
        name = Objects.requireNonNull(n, "brak");
    }

    public RequireNonNull(String n, int i) {
        Objects.requireNonNull(n, "Nazwisko nie może być null");
        name = n;
    }

    public static void run() {
        RequireNonNull e1 = new RequireNonNull(null);
        //e1.toString(); //NullPointerException

        RequireNonNull e2 = new RequireNonNull(null, 1);
        //e2.toString(); //NullPointerException
    }

    @Override
    public String toString() {
        return "RequireNonNull{" +
                "name='" + name + '\'' +
                '}';
    }
}
