package pl.sdacademy.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        GoogleRouteFinder googleRouteFinder = new GoogleRouteFinder();
        System.out.println(googleRouteFinder.findRoute("Katowice", "Warszawa"));
        System.out.println(googleRouteFinder.findRoute("Katowice", "Warszawa"));

        System.out.println("\nUżywamy cachowanego rout findera");
        CachedRouteFinder cachedRouteFinder = new CachedRouteFinder(googleRouteFinder);
        System.out.println(cachedRouteFinder.findRoute("Berlin", "Paryż"));
        System.out.println(cachedRouteFinder.findRoute("Berlin", "Paryż"));
    }
}
