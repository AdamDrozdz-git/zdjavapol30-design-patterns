package pl.sdacademy.designpatterns.singleton.eager.v2;

public class Universe {
    public final static Universe INSTANCE = new Universe();

    private Universe(){
        System.out.println("Tworzę instatncję");
    }

    private long age = 1235486521354L;

    public void setAge(long age) {
        this.age = age;
    }

    public long getAge() {
        return age;
    }
}
