package pl.sdacademy.solid._5_dip.v2;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Samochód " + model + " jedzie");
    }
}
