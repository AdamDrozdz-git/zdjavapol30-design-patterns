package pl.sdacademy.designpatterns.behavioral.visitor;

public interface Solicitor {
    void visit(HappyPerson person);
    void visit(AngryPerson person);
}
