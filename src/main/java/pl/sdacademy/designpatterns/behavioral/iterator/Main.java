package pl.sdacademy.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList(
                "Fiołek",
                "Róża",
                "Krokus",
                "Przebiśnieg"
        );
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
