package de.telran.module1.lesson_2023_11_24_fabrica_singltone.singltone.var2;

public enum Gate {
    INSTANCE();

    private boolean isOpen = false;

    private Gate() {
    }

    public void openGate(){
        this.isOpen = true;
    }
    public void closeGate(){
        this.isOpen = false;
    }

    public void isOpen() {
        if(isOpen){
            System.out.println("Gate opened");
        } else{
            System.out.println("Gate closed");
        }
    }
}
