package de.telran.module1.lesson_2023_11_08.task_2;

public class Main {
    public static void main(String[] args) {
        Phone phone_1 = new Phone("+49 222 22 22", "IPhone", 200);
        Phone phone_2 = new Phone("+38 999 99 99", "Samsung", 210);
        Phone phone_3 = new Phone("+11 111 11 11", "Nokia", 190);
        Phone[] phoneList = {phone_1, phone_2, phone_3};
        printPhonesData(phoneList);
    }
    private static void printPhonesData(Phone[] array) {
        array[0].receiveCall("John");
        System.out.println("===");
        for (Phone phone: array) {
            System.out.println(phone.toString());
        }

        for (Phone phone: array) {
            System.out.println(phone.getNumber());
        }
    }
}

