package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();

        Nicecar nicecar = new Nicecar();
        nicecar.start();
        nicecar.stop();
        nicecar.startMusic();
        nicecar.upgradeEngine();
        nicecar.start();
        nicecar.start();
    }
}
