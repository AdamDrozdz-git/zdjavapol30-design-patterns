package pl.sdacademy.designpatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Person person  = new HappyPerson();
        Solicitor solicitor = new ExperiencedSolicitor();
        person.accept(solicitor);

    }
}
