package pl.sdacademy.designpatterns.singleton.lazy.v1;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Start aplikacji");
        System.out.println("ładowanie klasy Universe");
        Class.forName("pl.sdacademy.designpatterns.singleton.lazy.v1.Universe");
        System.out.println("Przypisanie instatncji do zmiennej");
        Universe universe = Universe.getInstance();
        System.out.println(universe == Universe.getInstance());
    }
}
