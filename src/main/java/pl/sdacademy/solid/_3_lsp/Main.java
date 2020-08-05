package pl.sdacademy.solid._3_lsp;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 10, 5);
        stretch(rectangle);
        System.out.println(rectangle);

        Square square = new Square(8);
        stretch(square);
        System.out.println(square);

    }

    private static void stretch(Rectangle rectangle) {
        rectangle.setWidth(rectangle.getWidth() * 2);
    }
}
