package pl.sdacademy.solid._3_lsp;

public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        setWidth(height);

    }
}
