package pl.sdacademy.solid._5_dip.v1;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car("Fiat", engine);
        car.drive();
    }
}
