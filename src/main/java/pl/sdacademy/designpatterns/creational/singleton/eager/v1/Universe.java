package pl.sdacademy.designpatterns.creational.singleton.eager.v1;

public enum Universe {
    INSTANCE;
    ////////////
    Universe(){
        System.out.println("Tworzę instancję");
    }

    private long age = 1235486521354L;

    public void setAge(long age) {
        this.age = age;
    }

    public long getAge() {
        return age;
    }
}
