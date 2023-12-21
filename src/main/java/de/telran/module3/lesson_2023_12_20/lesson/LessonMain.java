package de.telran.module3.lesson_2023_12_20.lesson;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class LessonMain {
    public static void main(String[] args) {
        useStreams();
    }

    public static void useStreams(){
        List<String> list  = Arrays.asList("10","20","1","10","20","50","25");

        // filter
        List<String> listFiltered = list.stream()
                .filter(el->el.equals("10"))
                .toList();
        System.out.println(listFiltered);

        long count = list.stream()
                .filter(el->el.equals("10"))
//                .peek(System.out::println)
                .count();
        System.out.println(count);

        // sorted
        List<String> listSorted = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(listSorted);

        List<Integer> listInt = list.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(listInt
        );
    }
}
