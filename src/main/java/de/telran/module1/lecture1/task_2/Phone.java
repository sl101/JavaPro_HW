package de.telran.module1.lecture1.task_2;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        String resultString = String.format("Звонит %s", name);
        System.out.println(resultString);
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("Phone: %s\nnumber: %s\nweight: %s\n===========", model, number, weight);
    }
}
