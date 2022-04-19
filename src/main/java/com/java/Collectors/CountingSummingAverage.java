package com.java.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CountingSummingAverage {
    public static void run() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 23, 1.96));
        people.add(new Person("Mariusz", 35, 1.50));
        people.add(new Person("Dominik", 40, 1.80));

        Long collect = people.stream()
                .collect(counting());

        System.out.println(collect);

        Double collect1 = people.stream()
                .collect(summingDouble(Person::getHeight));

        System.out.println(collect1);

        Double collect2 = people.stream()
                .collect(averagingDouble(Person::getHeight));
        System.out.println(collect2);

        Optional<Integer> collect3 = people.stream()
                .map(Person::getAge)
                .collect(maxBy(Comparator.naturalOrder()));

        System.out.println(collect3.get());

        Optional<Integer> collect4 = people.stream()
                .map(Person::getAge)
                .collect(minBy(Comparator.naturalOrder()));

        System.out.println(collect4.get());
    }
}
