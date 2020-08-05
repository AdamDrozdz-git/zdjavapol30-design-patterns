package pl.sdacademy.solid._1_srp.v2;

public class Person {
    private String firstName;
    private String lastName;
    private ShoppingCart shoppingCart = new ShoppingCart();

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

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
