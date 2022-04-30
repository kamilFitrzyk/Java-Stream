package com.java;

import com.java.Class.Employee;
import com.java.Class.EmployeeRun;
import com.java.binarySearch.BinarySearch;
import com.java.enumTest.EnumTest;

import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {



    public static void  main(String[] args) throws IOException {

//        ToListSetMap.run();
//        Joining.run();
//        CountingSummingAverage.run();
//        Summarizing.run();
//        Grouping.run();



        /*
        * Variables
        * */

//        Variable.run();
//        PrintF.run();
//        Files.run();
//        Array.run();



        /*
        * Objects
        * */
//        DateLocalDate.run();
//        RequireNonNull.run();

        //EmployeeRun.run();

//        com.java.equals.EqualsTest.run();
//        EnumTest.run();

        //Binary Search

        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(5);
        array.add(7);
        array.add(1);
        array.add(10);
        array.add(9);
        array.add(8);
        array.add(7);

        Collections.sort(array);

        System.out.println(BinarySearch.binarySearch(array, 7));


    }



}
