package pl.sdacademy.designpatterns.behavioral.visitor;

public class BeginnerSolicitor implements Solicitor{
    @Override
    public void visit(HappyPerson person) {
        System.out.println("Szczęście początkującego");
    }

    @Override
    public void visit(AngryPerson person) {
        System.out.println("Poszło fatalnie");
    }
}
