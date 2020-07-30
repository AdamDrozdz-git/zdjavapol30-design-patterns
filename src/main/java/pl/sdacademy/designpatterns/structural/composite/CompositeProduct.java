package pl.sdacademy.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.List;

public class CompositeProduct implements Product {

    private List<Product> products;

    public CompositeProduct(Product... products){
        this.products = Arrays.asList(products);
    }
    @Override
    public int getPrice() {
        return products.stream()
                .mapToInt(product -> product.getPrice())
                .sum();
    }
}
