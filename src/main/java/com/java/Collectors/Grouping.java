package com.java.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void run() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 23, 1.96));
        people.add(new Person("Mariusz", 35, 1.50));
        people.add(new Person("Dominik", 40, 1.80));
        people.add(new Person("Dariusz", 40, 1.80));

        Map<Integer, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(collect);

        List<String> teams = new ArrayList<>();

        teams.add("Poland");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");
        teams.add("Sweden");

        Map<Integer, List<String>> collect1 = teams.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect1);

        Map<Boolean, List<String>> partitioning = teams.stream()
                .collect(Collectors.partitioningBy(team -> team.startsWith("S")));
        System.out.println(partitioning);
        System.out.println(partitioning.get(false));
        System.out.println(partitioning.get(true));

        Map<Boolean, List<Person>> collect2 = people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() > 25));

        System.out.println(collect2);
    }
}
