package pl.sdacademy.designpatterns.behavioral.visitor;

public class AngryPerson implements Person {
    @Override
    public void accept(Solicitor solicitor) {
        solicitor.visit(this);
    }
}
