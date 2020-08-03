package pl.sdacademy.designpatterns.structural.proxy;

public class Waypoints {
    private String origin;
    private String destination;

    public Waypoints(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Waypoints waypoints = (Waypoints) o;

        if (!origin.equals(waypoints.origin)) return false;
        return destination.equals(waypoints.destination);
    }

    @Override
    public int hashCode() {
        int result = origin.hashCode();
        result = 31 * result + destination.hashCode();
        return result;
    }
}
