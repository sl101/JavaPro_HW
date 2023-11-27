package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_1;

public class TransportFactory {
    private Plane plane;
    private Bus bus;
    private Train train;
    private double distance;

    public TransportFactory(double distance) {
        this.distance = distance;
        this.train = new Train();
        this.bus = new Bus();
        this.plane = new Plane();
    }

    public void getBestTransportByPrice(){
        double planePrice = this.plane.getPrice(this.distance);
        double trainPrice = this.train.getPrice(this.distance);
        double busPrice = this.bus.getPrice(this.distance);

        if (planePrice < trainPrice && planePrice < busPrice) {
            System.out.println("Best price: " + planePrice + " Euro by plane");
        } else if (trainPrice < planePrice && trainPrice < busPrice) {
            System.out.println("Best price: " + trainPrice + " Euro by train");
        } else if (busPrice < planePrice && busPrice < trainPrice) {
            System.out.println("Best price: " + busPrice + " Euro by bus");
        } else {
            System.out.println("Equal prices or no comparison possible");
        }
    };
    public void getBestTransportBySpeed(){
        double planeSpeed = this.plane.getSpeed(this.distance);
        double trainSpeed = this.train.getSpeed(this.distance);
        double busSpeed = this.bus.getSpeed(this.distance);

        if (planeSpeed < trainSpeed && planeSpeed < busSpeed) {
            System.out.println("Best speed: " + planeSpeed + " hours by plane");
        } else if (trainSpeed < planeSpeed && trainSpeed < busSpeed) {
            System.out.println("Best speed: " + trainSpeed + " hours by train");
        } else if (busSpeed < planeSpeed && busSpeed < trainSpeed) {
            System.out.println("Best speed: " + busSpeed + " hours by bus");
        } else {
            System.out.println("Equal speeds or no comparison possible");
        }
    };
}
