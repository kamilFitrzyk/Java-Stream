package com.java.Class;

import java.util.Date;

public class EmployeeRun {

    public static void run() {
        Employee harry = new Employee("Harry", new Date(), 1000);

        System.out.println(harry.getHireDay());

        Date newDate = harry.getHireDay();
        System.out.println(newDate);

        newDate.setTime(124124235);

        System.out.println(harry.getHireDay());
        System.out.println(newDate);
        /*
         *    Mon Apr 25 20:21:39 CEST 2022
         *    Mon Apr 25 20:21:39 CEST 2022
         *    Fri Jan 02 11:28:44 CET 1970
         *   Fri Jan 02 11:28:44 CET 1970
         *
         * with .clone();
         *   Mon Apr 25 20:25:05 CEST 2022
         *    Mon Apr 25 20:25:05 CEST 2022
         *   Mon Apr 25 20:25:05 CEST 2022
         *   Fri Jan 02 11:28:44 CET 1970
         *
         * */




        double persent = 10;
        System.out.println(persent);
        tripleValue(persent);
        System.out.println(persent);

        System.out.println(harry.getSalary());
        tripleSalary(harry); // przekazanie referencji do tripleSalary
        System.out.println(harry.getSalary());

        EmployeeWithOutConstructor emp = new EmployeeWithOutConstructor();
        System.out.println(emp);
    }

    public static void tripleValue(double x ) {
        x = 3 * x;
    }

    public static void tripleSalary(Employee x) { // zmienna x jest referencją
        x.raiseSalary(200);
    }

}
