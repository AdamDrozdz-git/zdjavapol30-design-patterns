package pl.sdacademy.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
 //       Product product = new Cheese();
  //      Product product = new Steak();
        Product product = new CompositeProduct(new Cheese(), new Steak());
        System.out.println(product.getPrice());

    }
}
