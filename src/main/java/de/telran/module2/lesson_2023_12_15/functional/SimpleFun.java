package de.telran.module2.lesson_2023_12_15.functional;

import java.util.function.Consumer;

public class SimpleFun {
    public static void main(String[] args) {
        simpleDoWork(new SimpleFunClass());
        simpleDoWork(new SimpleFunInterface() {
            @Override
            public void doWork() {
                System.out.println("Unanimous:doWork");
            }
        });

        String param = "Param";

        simpleDoWork(() -> System.out.println("Lamda: doWork"));
        simpleDoWorkConsumerString((arg) -> System.out.println("Consumer Lamda String: accept: " + arg));
        simpleDoWorkConsumerInteger(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Consumer Lamda Integer: accept: " + 555);
            }
        });
    }
    public  static void simpleDoWork(SimpleFunInterface simpleFunInterface){
        simpleFunInterface.doWork();
    }
    public  static void simpleDoWorkConsumerString(Consumer<String> consumer){
        consumer.accept("argument");
    }public  static void simpleDoWorkConsumerInteger(Consumer<Integer> consumer){
        consumer.accept(555);
    }
}

class SimpleFunClass implements SimpleFunInterface{

    @Override
    public void doWork() {
        System.out.println("SimpleFunClass:doWork");
    }
}