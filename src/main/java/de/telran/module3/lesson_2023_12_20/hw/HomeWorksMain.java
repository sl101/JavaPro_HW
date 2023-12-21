package de.telran.module3.lesson_2023_12_20.hw;

import com.github.javafaker.Faker;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HomeWorksMain {
    public static void main(String[] args) {
        doTask_1();
        System.out.println("--------------");
        doTask_2();
        System.out.println("--------------");
        doTask_3();
        System.out.println("--------------");
        doTask_4();
    }

    public static void doTask_1(){
        System.out.println("Задача 1");
        // Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
        //Сколько раз объект «Big» встречается в коллекции?

        List<String> arr = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        System.out.println("Найдено совпадений: " + findMatchesCount(arr,"Big"));
    }
    static long findMatchesCount(List<String> list, String string){
        return list.stream()
                .filter(el-> Objects.equals(el, string))
                .count();
    };
    public static void doTask_2(){
        System.out.println("Задача 2");
       // Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
        List<String> arr = Arrays.asList("a1", "b5", "a2", "b4");

        String minValue = arr.stream()
                .min(Comparator.comparing(String::valueOf))
                .orElse(null);
        System.out.println("Cамый маленький элемент");
        System.out.println(minValue);
    }
    public static void doTask_3(){
        System.out.println("Задача 3");
//        Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
        List<String> arr = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1").stream()
                .distinct()
                .sorted(Comparator.comparing(String::valueOf).reversed())
                .toList();
        System.out.println("Обратная сортировка");
        System.out.println(arr);
    }
    public static void doTask_4() {
        System.out.println("Задача 4");
        List<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < 30; i++) {
            employees.add(
                    new Employee(
                            new Faker().name().firstName(),
                            new Faker().name().lastName(),
                            new Faker().job().title(),
                            new Faker().commerce().department(),
                            new Random().nextInt(2000 - 500 + 1) + 500));
        }
        System.out.println("Все содрудники:");
        System.out.println(employees);
        System.out.println("--------------");
        doTask_4_1(employees);
        System.out.println("--------------");
        doTask_4_2(employees);
        System.out.println("--------------");
        doTask_4_3(employees);
        System.out.println("--------------");
        doTask_4_4(employees);
        System.out.println("--------------");
        doTask_4_5(employees);
        System.out.println("--------------");
        doTask_4_7(employees);
        System.out.println("--------------");
        doTask_4_8(employees);
    }

    public static void doTask_4_1( List<Employee> employees){
        System.out.println("Задача 4 1");
        // task 1: Вычислить среднюю зарплату всех сотрудников
        Double avaregeSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Task 1: средняя зарплата " + avaregeSalary);
    }
    public static void doTask_4_2( List<Employee> employees){
        System.out.println("Задача 4 2");
        // task 2: Получить список сотрудников с зп > 1000
        List<Employee> employeesTopSalariesList = employees.stream()
                .filter(empl-> empl.getSalary()>1000)
                .toList();
        System.out.println("Содрудники отдела с зп >1000: ");
        System.out.println(employeesTopSalariesList);
    }
    public static void doTask_4_3( List<Employee> employees){
        System.out.println("Задача 4 3");
        // task 3: Получить список сотрудников из отдела маркетинг и увеличить зп на 15%

        List<Employee> employeesDeparmentdefaultSalary = employees.stream()
                .filter(employee-> employee.getDepartment().equals("Grocery"))
                .toList();
        System.out.println("Содрудники отдела Grocery: ");
        System.out.println(employeesDeparmentdefaultSalary);

        List<Employee> employeesDeparmentIncreaseSlary = employees.stream()
                .filter(employee-> employee.getDepartment().equals("Grocery"))
                .map(employee -> {
                    employee.setSalary(employee.getSalary() * 115/100);
                    return employee;
                })
                .toList();
        System.out.println("Содрудники отдела Grocery + 15% зп: ");
        System.out.println(employeesDeparmentIncreaseSlary);
    }
    public static void doTask_4_4( List<Employee> employees){
        System.out.println("Задача 4 4");
//        4.Получить сотрудника с самой низкой зп

        Employee employee = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println("Минимальная зп у сотрудника: "+employee);
    }

    public static void doTask_4_5( List<Employee> employees){
        System.out.println("Задача 4 5");
//        5.Получить сотрудника с самой высокой зп
        Employee employee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println("Максимальная зп у сотрудника: "+employee);
    }

    public static void doTask_4_7( List<Employee> employees){
        System.out.println("Задача 4 7");
//        7. Получите сотрудников из всех отделов с максимальной зп
        Map<String, Employee> employeesDepHighSalary =  employees.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Function.identity(),
                        (existing, replacement) ->
                                existing.getSalary() >= replacement.getSalary() ? existing : replacement));

        System.out.println("Сотрудники с максимальной зп по отделам:");
        System.out.println(employeesDepHighSalary);
    }
    public static void doTask_4_8( List<Employee> employees){
        System.out.println("Задача 4 8");
//        8. Сгруппировать сотрудников по должности
        Map<String, List<Employee>> emploiesByDeparmets =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getJobTitle));

        System.out.println("Сгруппировать сотрудников по должности:");
        System.out.println(emploiesByDeparmets);
    }
}
