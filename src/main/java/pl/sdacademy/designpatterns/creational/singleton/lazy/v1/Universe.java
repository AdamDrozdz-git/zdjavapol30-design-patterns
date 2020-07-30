package pl.sdacademy.designpatterns.creational.singleton.lazy.v1;

public class Universe {
    private static Universe instance;

    public static Universe getInstance() {
        if (instance == null){
            instance = new Universe();
        }
        return instance;
    }

    private Universe(){
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
