package pl.sdacademy.solid._2_ocp.v2;

public class Doctor extends Worker {
    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Leczy");
    }
}
