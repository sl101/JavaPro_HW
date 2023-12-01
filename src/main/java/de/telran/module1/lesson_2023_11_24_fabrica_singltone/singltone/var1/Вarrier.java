package de.telran.module1.lesson_2023_11_24_fabrica_singltone.singltone.var1;

public class Вarrier {
    private static Вarrier instance;
    private boolean isOpen = false;

    private Вarrier(){
    }
    public static Вarrier getInstance(){
        if(instance == null){
            instance = new Вarrier();
        }
        return instance;
    };

    public void openBarrier(){
        this.isOpen = true;
    }
    public void closeBarrier(){
        this.isOpen = false;
    }

    public void isOpen() {
        if(isOpen){
            System.out.println("Barrier opened");
        } else{
            System.out.println("Barrier closed");
        }
    }
}
