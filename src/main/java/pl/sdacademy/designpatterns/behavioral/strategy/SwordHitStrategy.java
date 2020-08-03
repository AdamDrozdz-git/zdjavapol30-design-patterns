package pl.sdacademy.designpatterns.behavioral.strategy;

public class SwordHitStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Uderza mieczem");
    }
}
