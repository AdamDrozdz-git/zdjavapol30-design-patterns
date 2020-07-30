package pl.sdacademy.designpatterns.creational.singleton.eager.v1;

import pl.sdacademy.designpatterns.creational.singleton.eager.v2.Universe;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Start aplikacji");
        System.out.println("ładowanie klasy Universe");
        Class.forName("pl.sdacademy.designpatterns.creational.singleton.eager.v1.Universe");
        System.out.println("Przypisanie instatncji do zmiennej");
        Universe universe = Universe.INSTANCE;
        System.out.println(universe == Universe.INSTANCE);
    }
}
