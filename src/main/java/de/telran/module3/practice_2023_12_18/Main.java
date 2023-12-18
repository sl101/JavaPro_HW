package de.telran.module3.practice_2023_12_18;

public class Main {
    public static void main(String[] args) {
//        m(()->System.out.println(" 88888888888888"));
//        ref();
        m(Main::ref);
    }
    public static void m(Inter inter){
        inter.get();
    }
    public static void ref(){
        System.out.println("---------");
    }
}

interface Inter{
    void get();
}