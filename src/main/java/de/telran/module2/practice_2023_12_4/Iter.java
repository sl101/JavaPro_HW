package de.telran.module2.practice_2023_12_4;

import java.util.*;

public class Iter {
    public static void main(String[] args) {
        /**
         * M A D A M
         * SADDES
         * WOOD
         */
//        classWork();
//        System.out.println(isPalindrom("SADDES"));
        System.out.println(isPalindrom("MdM"));
    }

    public static void classWork(){
        List<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.add("ff");
        list.add("gg");


        ListIterator<String> forward = list.listIterator();
        ListIterator<String> backward = list.listIterator(list.size());

        while (forward.hasNext()) {
            String f = forward.next();
            System.out.println("FORWARD: " + f);
        }

        while (backward.hasPrevious()) {
            String b = backward.previous();
            System.out.println("BACKWARD: " + b);
        }
    }

    public static String isPalindrom(String current){

        List<Character> list = new LinkedList<>();

        for (char c : current.toLowerCase().toCharArray()) {
            list.add(c);
        }
        System.out.println(list);
        ListIterator<Character> forward = list.listIterator();
        ListIterator<Character> backward = list.listIterator(list.size());

        int center = list.size()/2;

        while (forward.next() == backward.previous() && center !=0) {
            center--;
        }
        if(center ==0){
            return "Палиндром";
        }
        return "Это не палиндром";
    }
}