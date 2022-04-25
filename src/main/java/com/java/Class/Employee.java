package com.java.Class;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Employee {

    private static int nextId;

    private int id;
    private String name;
    private Date hireDay;
    private double salary;

    //blok inicjalizujący obiekt, przed konstruktorem
    {
        id = nextId;
        nextId++;
    }

    //statyczny blok inicjalizujący
    static
    {
        var generator = new Random();
        nextId = generator.nextInt();
    }

    public Employee(String name, Date hireDay) {
        this.name = name;
        this.hireDay = hireDay;
    }

    public Employee(String name, Date hireDay, double salary) {
        this(name, hireDay);
        this.salary = salary;
    }



    public Date getHireDay() {
        return (Date) hireDay.clone();
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public double getSalary() {
        return salary;
    }
}
