package pl.sdacademy.solid._5_dip.v2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car("Fiat", engine);
        car.drive();
    }
}
