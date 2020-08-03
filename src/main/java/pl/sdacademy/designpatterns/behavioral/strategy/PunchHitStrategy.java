package pl.sdacademy.designpatterns.behavioral.strategy;

public class PunchHitStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Uderza pięścią");
    }
}
