package pl.sdacademy.designpatterns.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractLetterWriterHelper letterWriterHelper = new InformalLetterWriterHelper();
        String letter = letterWriterHelper.create(
                "Adam Nowak",
                "Jan Kowalski",
                "Treść listu");
        System.out.println(letter);
    }
}
