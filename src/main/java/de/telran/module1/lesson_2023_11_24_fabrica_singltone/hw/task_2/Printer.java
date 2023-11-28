package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_2;

public enum Printer {
    INSTANCE();

    private boolean isBusy = false;

    private Printer() {
    }

    public void usePrinter(){
        this.isBusy = true;
    }
    public void unUsePrinter(){
        this.isBusy = false;
    }

    public boolean isBusy(){
        if(isBusy){
            System.out.println("Printer is busy");
            System.out.println("You have to wait...");
            return true;
        } else{
            System.out.println("Printer is free");
            return  false;
        }
    }

}
