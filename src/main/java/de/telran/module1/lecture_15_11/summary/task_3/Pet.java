package de.telran.module1.lecture_15_11.summary.task_3;

public class Pet extends Animal {
    private boolean trained;

    public Pet(String name, int age, boolean trained) {
        super(name, age);
        this.trained = trained;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        if(trained){
        System.out.println("обучен манерам");
        } else {
            System.out.println("не обучен манерам");
        }
    }
}