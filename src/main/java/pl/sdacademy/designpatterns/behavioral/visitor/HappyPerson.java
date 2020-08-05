package pl.sdacademy.designpatterns.behavioral.visitor;

public class HappyPerson implements Person {
    @Override
    public void accept(Solicitor solicitor) {
        solicitor.visit(this);
    }
}
