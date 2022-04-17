package com.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamExampleTest {

    List<Employee> employees = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Employee employee1 = new Employee("Dawid","Laskowski",30, List.of("Java","PHP"));
        Employee employee2 = new Employee("Kamil","P",30, List.of("GIT","PHP"));
        Employee employee3 = new Employee("Zygmund","Paralowski",30, List.of("Linux","PHP"));
        Employee employee4 = new Employee("Karol","Kacperczyk",30, List.of("Java","Spring","Hibernate"));
        Employee employee5 = new Employee("Katarzyna","Penetretion",30, List.of("Java","PHP"));
        Employee employee6 = new Employee("Aneta","Pusowka",30, List.of("Pascale","PHP"));
        Employee employee7 = new Employee("Krzysztof","Nakowski",30, List.of("Java","PHP"));

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

}