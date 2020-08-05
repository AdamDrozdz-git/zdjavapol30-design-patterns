package pl.sdacademy.solid._2_ocp.v2;

public class Firefighter extends Worker {
    public Firefighter(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Gasi pożar");
    }
}
