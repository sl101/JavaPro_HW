package de.telran.module2.lesson_2023_11_27_arrays.hw.task_1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicIntArray dynamicIntArray = new DynamicIntArray(2);
        addElementExaple(dynamicIntArray);
        addArrayExaple(dynamicIntArray);
        insertElementExaple(dynamicIntArray);
        deleteElementExaple(dynamicIntArray);
        getElementExaple(dynamicIntArray);
}
    public static void addElementExaple(DynamicIntArray dynamicIntArray){
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
        dynamicIntArray.add(20);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
        dynamicIntArray.add(21);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
        dynamicIntArray.add(22);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
        dynamicIntArray.add(23);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
        dynamicIntArray.add(24);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
    }
    public static void addArrayExaple(DynamicIntArray dynamicIntArray){
        int [] array = new int []{11,12,13};
        dynamicIntArray.add(array);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
    }
    public static void insertElementExaple(DynamicIntArray dynamicIntArray){
        int insertElement = 18;
        int insertIndex = 1;
        dynamicIntArray.insert(insertIndex, insertElement);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
    }
    public static void deleteElementExaple(DynamicIntArray dynamicIntArray){
        int deleteIndex = 2;
        dynamicIntArray.delete(deleteIndex);
        System.out.println(Arrays.toString(dynamicIntArray.getArr()));
    }
    public static void getElementExaple(DynamicIntArray dynamicIntArray) {
        int index = 44;
        System.out.println(dynamicIntArray.get(index));
    }
}
