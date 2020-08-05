package pl.sdacademy.solid._2_ocp.v1;

public class Worker {
    private String firstName;
    private String lastName;
    private String profession;

    public Worker(String firstName, String lastName, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void work() {
        switch (profession){
            case "Firefighter":
                System.out.println("Gasi pożar");
                break;
            case "Doctor":
                System.out.println("Leczy");
                break;
        }

    }
}
