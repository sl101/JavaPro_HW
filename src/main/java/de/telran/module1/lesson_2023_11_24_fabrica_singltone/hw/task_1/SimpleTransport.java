package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_1;

public class SimpleTransport {

    public static void main(String[] args) {
        double exampleDistance = 500;
        TransportFactory factory = new TransportFactory(exampleDistance);

        factory.getBestTransportByPrice();
        factory.getBestTransportBySpeed();
    }

}
