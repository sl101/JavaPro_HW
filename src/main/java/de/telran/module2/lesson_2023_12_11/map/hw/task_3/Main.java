package de.telran.module2.lesson_2023_12_11.map.hw.task_3;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        int[] arr1 = new int[]{1,3,2,4,5,6,3,0};
//        int[] arr1 = new int[]{};
        int[] arr1 = new int[]{1,3,2,4,5,6,3};
        int[] arr2 = new int[]{1,2,3,4,5,3,6,};

        isArrayEven(arr1, arr2);


    }
    static void isArrayEven(int[] arrOne, int[] arrTwo){
        if (arrOne.length != arrTwo.length) {
            System.out.println(false);
            return;
        }
        // example #1
//        Arrays.sort(arrOne);
//        Arrays.sort(arrTwo);
//        System.out.println(Arrays.hashCode(arrOne) == Arrays.hashCode(arrTwo));

        // example #2
        Map <Integer, Integer> targetArray = new HashMap<Integer, Integer>();

        for (int elem: arrOne){
            targetArray.put(elem, targetArray.getOrDefault(elem, 0) + 1);
        }
        for(int elem: arrTwo){
            if(targetArray.containsKey(elem)){
                targetArray.put(elem, targetArray.get(elem)-1 );
            } else{
                System.out.println(false);
            }
            if(targetArray.get(elem) == 0){
                targetArray.remove(elem);
            }
        }
        if (targetArray.isEmpty()) {
            System.out.println(true);
        }
    }
}
