package de.telran.module2.lesson_2023_12_11.map.hw.task_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 1, 5, 6, 6 ,6 ,4 ,1 ,3};

        findFirstElementOccurringKTimes(arr, 2 );
    }

    public static void findFirstElementOccurringKTimes(int[] array, int k){

        if (array == null || array.length == 0 || k <= 0) {
            System.out.println("Invalid input");
            return;
        }

        Map<Integer,Integer> frequencyMap = new LinkedHashMap<Integer,Integer>();

        for (int elem: array){
            frequencyMap.put(elem, frequencyMap.getOrDefault(elem, 0) + 1);
        }

        for (int elem: array){
            if(frequencyMap.get(elem) == k){
                System.out.println("Элемент " + elem + " первым встречается в массиве " + k + " раз");
                return;
            }
        }
    }
}
