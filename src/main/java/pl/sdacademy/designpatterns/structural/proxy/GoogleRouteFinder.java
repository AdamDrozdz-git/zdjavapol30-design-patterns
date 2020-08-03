package pl.sdacademy.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class GoogleRouteFinder implements RouteFinder {
    @Override
    public List<String> findRoute(String origin, String destination) {
        System.out.println("Wysłanie zapytania do serwisu Google.....");
        return Arrays.asList("Wyjedź z " + origin,
                "Skreć w prawo",
                "Jedź prosto",
                "Dpjechałeś do " + destination);
    }
}
