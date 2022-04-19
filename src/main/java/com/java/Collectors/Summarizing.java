package com.java.Collectors;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summarizing {
    public static void run() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 23, 1.96));
        people.add(new Person("Mariusz", 35, 1.50));
        people.add(new Person("Dominik", 40, 1.80));

        IntSummaryStatistics collect = people.stream()
                .collect(Collectors.summarizingInt(Person::getAge));

        System.out.println(collect);
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getSum());
        System.out.println(collect.getAverage());
        System.out.println(collect.getCount());


    }
}
