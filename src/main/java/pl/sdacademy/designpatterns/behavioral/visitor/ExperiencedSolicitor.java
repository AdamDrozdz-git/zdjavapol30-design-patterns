package pl.sdacademy.designpatterns.behavioral.visitor;

public class ExperiencedSolicitor implements Solicitor {
    @Override
    public void visit(HappyPerson person) {
        System.out.println("Duża sprzedaż");
    }

    @Override
    public void visit(AngryPerson person) {
        System.out.println("Ledwo co sprzedał");
    }
}
