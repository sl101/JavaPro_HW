package de.telran.module1.lesson_2023_11_24_fabrica_singltone.fabrica;

public class DonutsFactory {

    public static Donutable getInstance(DonutType type){
        Donutable returnDonut = null;
        switch (type){
            case CHERY: returnDonut = new CheryDonut();
                break;
            case CHOCOLATE: returnDonut = new CheryDonut();
                break;
            case PEACH: returnDonut = new CheryDonut();
        }
        return returnDonut;
    }
}
