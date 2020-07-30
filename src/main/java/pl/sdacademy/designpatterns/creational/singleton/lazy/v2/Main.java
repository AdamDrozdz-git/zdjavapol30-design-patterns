package pl.sdacademy.designpatterns.creational.singleton.lazy.v2;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Start aplikacji");
        System.out.println("ładowanie klasy Universe");
        Class.forName("pl.sdacademy.designpatterns.creational.singleton.lazy.v2.Universe");
        System.out.println("Przypisanie instatncji do zmiennej");
        Universe universe = Universe.getInstance();
        System.out.println(universe == Universe.getInstance());
    }
}
