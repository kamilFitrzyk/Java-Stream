package com.java.interfaces.stream;

import com.java.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {
    List<Employee> employees = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Employee employee1 = new Employee("Dawid","Laskowski",30, List.of("Java","PHP"));
        Employee employee2 = new Employee("Kamil","P",28, List.of("GIT","PHP"));
        Employee employee3 = new Employee("Zygmund","Paralowski",25, List.of("Linux","PHP"));
        Employee employee4 = new Employee("Karol","Kacperczyk",40, List.of("Java","Spring","Hibernate"));
        Employee employee5 = new Employee("Kamil","Penetretion",34, List.of("Java","PHP"));
        Employee employee6 = new Employee("Aneta","Pusowka",32, List.of("Pascale","PHP"));
        Employee employee7 = new Employee("Krzysztof","Nakowski",31, List.of("Java","PHP"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
    }

    @Test
    public void firstStream() {
        //employees.stream().forEach(employee -> System.out.println(employee));
        employees.forEach(System.out::println);
    }

    @Test
    public void mapOperation() {
        employees.stream()
                //.map(Employee::getFirstName);
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .forEach(System.out::println);
    }

    @Test
    public void allSkillsMapOperation() {
        List<List<String>> allSkills = employees.stream()
                .map(Employee::getSkills)
                .collect(Collectors.toList());

        System.out.println(allSkills);
    }

    @Test
    public void flatMapOperation() {
        List<String> allSkills2 = employees.stream()
                .map(Employee::getSkills)
                .flatMap(list -> list.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(allSkills2);
    }

    @Test
    public void filterOperation() {
        employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("K"))
                .forEach(System.out::println);
    }

    @Test
    void sortedOperation() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .forEach(System.out::println);
    }

    @Test
    void limitOperation() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void skipOperation() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .skip(2)
                .forEach(System.out::println);

    }

    @Test
    void coutOperation() {
        long numberOfEmployees = employees.stream()
                .filter(employee -> employee.getLastName().startsWith("P"))
                .count();

        System.out.println(numberOfEmployees);
    }

    @Test
    void minMaxOperation() {
        Employee youngestEmployee = employees.stream()
                .min(Comparator.comparing(Employee::getAge))
                .get();

        Employee oldestEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getAge))
                .get();

        System.out.println(youngestEmployee);
        System.out.println(oldestEmployee);
    }

    @Test
    void findAnyFindFirstOperation() {
        Employee employee =  employees.stream()
                .filter(emp -> emp.getLastName().startsWith("P"))
                .findAny()
                //.findFirst()
                .get();

        System.out.println(employee);
    }

    @Test
    void matchOperation() {
        boolean p = employees.stream()
                .allMatch(employee -> employee.getFirstName().startsWith("P"));

        boolean a = employees.stream()
                .allMatch(employee -> employee.getFirstName().contains("a"));

        boolean aAnyMatch = employees.stream()
                .anyMatch(employee -> employee.getFirstName().contains("a"));

        boolean zNoneMatch = employees.stream()
                .noneMatch(employee -> employee.getFirstName().contains("z"));

        System.out.println(p);
        System.out.println(a);
        System.out.println(aAnyMatch);
        System.out.println(zNoneMatch);
    }

    @Test
    void reduceOperation() {
        Integer sumOfAllAges = employees.stream()
                .map(Employee::getAge)
                .reduce(Integer::sum)
                .get();
        System.out.println(sumOfAllAges);

        Integer sumOfAllAges2 = employees.stream()
                .map(Employee::getAge)
                .reduce(0, Integer::sum);

        System.out.println(sumOfAllAges2);

        Integer sumOfAllAges3 = employees.stream()
                .reduce(0, (age, employees) -> age + employees.getAge(), Integer::sum);

        System.out.println(sumOfAllAges3);

        String allNames = employees.stream()
                .map(Employee::getFirstName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .get();

        System.out.println(allNames);
    }

    @Test
    void takeWhileOperation() {
        //first sorted stream
        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .takeWhile(employee -> employee.getAge() < 30)
                .forEach(System.out::println);
    }

    @Test
    void dropWhileOperation() {
        //first sorted stream
        employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .dropWhile(employee -> employee.getAge() < 30)
                .forEach(System.out::println);
    }

    @Test
    void forEachOrdered() {
        String sentence = "Jak nauczyć się programowania";

        sentence.chars().forEach(s -> System.out.print((char)s));
        System.out.println();
        sentence.chars().parallel().forEach(s -> System.out.print((char) s));
        System.out.println();
        sentence.chars().parallel().forEachOrdered(s -> System.out.print((char) s));
        System.out.println();
    }





    @Test
    void peekOperation() {
        //support debugging

        List<Employee> newEmployees = employees.stream()
                .peek(employee -> employee.setFirstName("Kamil"))
                .collect(Collectors.toList());

        System.out.println(newEmployees);
        System.out.println();
        System.out.println(employees);
    }

    @Test
    public void test() {
        Map<String, Integer> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getFirstName, Collectors.summingInt(Employee::getAge)));

        System.out.println(collect);


        Map<String, List<Employee>> collect2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getFirstName, Collectors.mapping(Function.identity(),
                        Collectors.collectingAndThen(Collectors.toList(), e -> e.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList())))));

        System.out.println(collect2);


        employees.stream()
                .collect(Collectors.groupingBy(Employee::getFirstName));



//        Map<String, Long> counted = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        Map<String, Long> sorted = counted.entrySet().stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .limit(10)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

}
