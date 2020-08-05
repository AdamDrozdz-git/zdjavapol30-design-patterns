package pl.sdacademy.solid._1_srp.v2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> products = new ArrayList<>();

    public void add(String product){
        products.add(product);
    }

    public void print(){
        products.forEach(System.out::println);
    }
}
