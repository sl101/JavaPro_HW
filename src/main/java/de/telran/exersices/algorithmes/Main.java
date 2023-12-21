package de.telran.exersices.algorithmes;

import javax.security.auth.login.CredentialNotFoundException;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9,12};
//        int number = 12;
//        if (binarySearch(array,number)==-1) System.out.println("the number you're looking for is not here");
//        else System.out.println(binarySearch(array,number));

        // =======
        int number = 3;
        if (binarySearchRec(array,number,0,array.length-1)==-1) System.out.println("the number you're looking for is not here");
        else System.out.println(binarySearchRec(array,number,0,array.length-1));

    }
    public static int binarySearchRec(int[] arr, int num, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (num > arr[mid]) {
            return binarySearchRec(arr, num, mid + 1, end);
        } else if (num < arr[mid]) {
            return binarySearchRec(arr, num, start, mid - 1);
        } else return mid;
    }
//    public static int binarySearch(int[] arr,int num){
//        int start = 0;
//        int end = arr.length - 1;
//        while (end >= start) {
//            int mid = (start + end) / 2;
//            if (num > arr[mid]) {
//                start = mid + 1;
//            } else if (num < arr[mid]) {
//                end = mid - 1;
//            } else return mid;
//        }
//        return -1;
//    }

}
