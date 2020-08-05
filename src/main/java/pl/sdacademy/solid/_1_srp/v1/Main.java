package pl.sdacademy.solid._1_srp.v1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Nowak");
        System.out.println(person.getFirstName() + " " + person.getLastName());
        person.addToShoppingCart("Stek");
        person.addToShoppingCart("ser");
        person.printShoppingCart();
    }
}
