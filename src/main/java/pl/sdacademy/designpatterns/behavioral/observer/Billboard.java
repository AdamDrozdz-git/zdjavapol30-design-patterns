package pl.sdacademy.designpatterns.behavioral.observer;

public class Billboard implements PressObserver {
    @Override
    public void update(String paper) {
        System.out.println("Na billboardzie jest wyświetlona informacja o wydaniu gazety: "
                + paper);
    }
}
