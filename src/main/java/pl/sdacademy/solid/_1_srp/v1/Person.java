package pl.sdacademy.solid._1_srp.v1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private List<String> shoppingCart = new ArrayList<>();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addToShoppingCart(String product){
        shoppingCart.add(product);
    }

    public void printShoppingCart(){
        shoppingCart.forEach(System.out::println);
        // Inaczej:  shoppingCart.forEach(product -> System.out.println(product));
    }
}
