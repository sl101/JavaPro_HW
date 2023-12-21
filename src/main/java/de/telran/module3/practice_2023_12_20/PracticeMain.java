package de.telran.module3.practice_2023_12_20;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class PracticeMain {
    public static void main(String[] args) {
//        useExample();
//        useTask1();
//        useTask2();
//        useTask3();
//        useTask4();
//        useTask5();
//        useTask6();
//        useTask7();
//        useTask8();
//        useTask9();
        useTask10();
    }

    public static void useTask10() {
        // Задача 10: Группировка по критерию и подсчет среднего.
        List<Person> task10Input = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Alice", 35),
                new Person("Charlie", 40));

        Map<String, Double> averageAgeByName = task10Input.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.averagingInt(Person::getAge)));

        System.out.println(averageAgeByName);
    }

    public static void useTask9() {

        // Задача 9: Подсчет суммы значений объектов.
        List<Person> task9Input = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35));

        int totalAge = task9Input.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(totalAge);
    }

    @AllArgsConstructor
    @Getter
    static class Person {
        String name;
        int age;
    }

    public static void useTask8() {
        // Задача 8: Построение кастомной мапы из элементов.
        Map<String, Integer> task8 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toMap(String::valueOf, el -> el ));
        System.out.println(task8);
    }
    public static void useTask7() {
// Задача 7: Разбиение строки на символы и сбор их в множество.
        String task7Input = "hello";

        List<String> list = task7Input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .toList();
        System.out.println(list);
    }

    public static void useTask6() {
        // Задача 6: Объединенить в строку элементы с равной максимальной длиной.
//        String task6 = Stream.of("apple", "banana", "cherry", "date")
        String[] strings = {"apple", "banana", "cherry", "date"};
        int maxLength = Stream.of(strings)
                .mapToInt(String::length)
                .max()
                .orElse(0);

        String result = Stream.of(strings)
                .filter(s -> s.length() == maxLength)
                .collect(Collectors.joining(""));
        System.out.println(result);
    }

    public static void useTask5() {
        // Задача 5: Собрать только уникальные элементы в список.
        List<String> task5Input = Arrays.asList("A", "B", "A", "C", "B", "D");

        Set<String> task5Output = task5Input.stream()
                .collect(Collectors.toSet());

        System.out.println(task5Output);
    }

    public static void useTask4() {
        // Задача 4: Подсчет повторяющихся элементов и создание мапа.
        List<String> task4Input = Arrays.asList("A", "B", "A", "C", "B", "A");

//        Map<String, Long> task4Output = task4Input.stream()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Map<String, Integer> task4Output = task4Input.stream()
                .collect(Collectors.toMap(el -> el, el -> -1, Integer::sum));

        System.out.println(task4Output);
    }

    public static void useTask3() {
        // Задача 3: Группировка строк по длине.
        Map<Integer, List<String>> task3 = Stream.of("apple", "banana", "cherry", "date")
                .collect(Collectors.groupingBy(String::length));

        System.out.println(task3);
    }

    public static void useTask2() {
//        Задача 2: Удалить дубликаты из списка и собрать их в множество.
        List<String> task2Input = Arrays.asList("A", "B", "A", "C");
        List<String> task2Output = task2Input.stream()
                .distinct()
                .toList();

        System.out.println(task2Output);
    }

    public static void useTask1() {
//        Задача 1: Собрать элементы потока в список.
        List<String> task1 = Stream.of("A", "B", "C").toList();
        System.out.println(task1);
    }

    public static void useExample() {
        List<String> list = Arrays.asList("MAMA", "Myla", "ramu");
        List<String> listLoaded = list.stream()
                .map(el -> {
                    if (el.startsWith("M")) System.out.println("***********");
                    return el.toLowerCase();
                }).toList();
        System.out.println(listLoaded);
    }

}
