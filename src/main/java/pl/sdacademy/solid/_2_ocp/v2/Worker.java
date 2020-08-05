package pl.sdacademy.solid._2_ocp.v2;

public abstract class Worker {
    private String firstName;
    private String lastName;

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public  abstract void work();
}
