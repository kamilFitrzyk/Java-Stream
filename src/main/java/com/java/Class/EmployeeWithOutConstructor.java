package com.java.Class;

public class EmployeeWithOutConstructor {
    private static int nextId;
    private int id = assignId();
    private String name = "";

    private int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }

    @Override
    public String toString() {
        return "EmployeeWithOutConstructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
