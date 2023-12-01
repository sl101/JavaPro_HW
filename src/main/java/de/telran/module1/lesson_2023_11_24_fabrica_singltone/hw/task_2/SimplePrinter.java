package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_2;

public class SimplePrinter {
    public static void main(String[] args) {

    PrinterFactory process_1 = new PrinterFactory();
    PrinterFactory process_2 = new PrinterFactory();
    process_1.startCopy();
    process_2.starScan();
    process_1.stopCopy();
    process_2.starScan();
    process_1.startCopy();
    }
}
