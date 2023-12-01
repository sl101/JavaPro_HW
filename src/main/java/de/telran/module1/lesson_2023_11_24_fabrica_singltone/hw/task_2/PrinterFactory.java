package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_2;

public class PrinterFactory {
    Printer printer = Printer.INSTANCE;

    public void startCopy(){
    if(!printer.isBusy()){
        System.out.println("Printer started copy");
        System.out.println("=====");
        printer.usePrinter();
    }
    } public void starScan(){
        if(!printer.isBusy()){
            System.out.println("Printer started scan");
            System.out.println("=====");
            printer.usePrinter();
        }
    }  public void stopCopy(){
        printer.unUsePrinter();
    } public void stopScan(){
        printer.unUsePrinter();
    }
}
