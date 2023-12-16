package de.telran.module2.lesson_2023_12_11.map.hw.task_4;

import java.util.Arrays;

//4)* Сгруппируйте слова с одинаковым набором символов
//        Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
//        вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//        Выход:
//        student, students,
//        cat, act,
//        dog, god,
//        flow, wolf
public class Main {
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};

        // TODO: not finished now
        for (String word: words){
            String[] spitedWord = word.split("");
            Arrays.sort(spitedWord); // Сортируем массив символов
//            String sortedWord = String.join("", hashWord); // Объединяем символы обратно в строку
            System.out.println(Arrays.toString(spitedWord));
        }
    }

    public static void groupWords(String array){}
}
