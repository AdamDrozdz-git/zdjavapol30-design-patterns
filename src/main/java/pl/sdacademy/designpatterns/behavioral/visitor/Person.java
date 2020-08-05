package pl.sdacademy.designpatterns.behavioral.visitor;

public interface Person {
    void accept(Solicitor solicitor);
}
