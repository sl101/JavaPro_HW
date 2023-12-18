package de.telran.module3.lesson_2023_12_18_FunkInt.lesson;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class SimpleMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = weight-> weight<10;
        System.out.println(predicate.test(10));
        System.out.println("---------");

        BiPredicate<Integer, Double> biPredicate = (width,height) -> width >= height;
        System.out.println(biPredicate.test(3, 3.0001));
        System.out.println("---------");

        System.out.println(UnaryOperator.identity().apply(5));
    }
}
