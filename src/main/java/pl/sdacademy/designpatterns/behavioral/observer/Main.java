package pl.sdacademy.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PressPublisher pressPublisher = new PressPublisher("Whashington post");

        PressReader adamNowak = new PressReader("Adam Nowak");
        pressPublisher.addObserver(adamNowak);
        PressReader janKowalski = new PressReader("Jan Kowalski");
        pressPublisher.addObserver(janKowalski);

        Billboard billboard = new Billboard();
        pressPublisher.addObserver(billboard);

        pressPublisher.publish("Nowe wydanie gazety TODAY!");
    }
}
