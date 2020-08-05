package pl.sdacademy.solid._1_srp.v2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Nowak");
        System.out.println(person.getFirstName() + " " + person.getLastName());
        ShoppingCart shoppingCart = person.getShoppingCart();
        shoppingCart.add("Steak");
        shoppingCart.add("Ser");
        shoppingCart.print();
    }
}
