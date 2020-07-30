package pl.sdacademy.designpatterns.singleton.lazy.v2;

public class Universe {
    private static Universe instance;

// double check blocking
    public static Universe getInstance() {
        if (instance == null) {
            synchronized (Universe.class) {
                if (instance == null) {
                    instance = new Universe();
                }
            }
        }
        return instance;
    }

    private Universe() {
        System.out.println("Tworzę instatncję");
    }

    ///////////////////////
    private long age = 1235486521354L;

    public void setAge(long age) {
        this.age = age;
    }

    public long getAge() {
        return age;
    }
}
