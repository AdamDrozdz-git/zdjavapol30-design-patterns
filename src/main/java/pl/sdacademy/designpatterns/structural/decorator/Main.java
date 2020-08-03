package pl.sdacademy.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Cheese cheese = new Cheese();
        System.out.println("cena sera: " + cheese.getPrice());
        DiscountedProduct discountedCheese = new DiscountedProduct(cheese, 3);
        System.out.println("Cena sera po rabacie: " + discountedCheese.getDiscountPrice());

        DiscountedProduct twiceDiscountedSteak =
                new DiscountedProduct(new DiscountedProduct(new Steak(), 1), 2);
    }
}
