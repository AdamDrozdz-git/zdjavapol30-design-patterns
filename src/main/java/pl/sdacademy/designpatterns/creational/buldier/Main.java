package pl.sdacademy.designpatterns.creational.buldier;


public class Main {
    public static void main(String[] args) {
        Building.Builder builder = new Building.Builder()
                .withAddress("ul. abc 12/5")
                .withArea(105);
        // tu mogłyby się znaleźć przeróżne istrukcjie
        builder.withHeight(1500);
        Building building1 = builder.build();
        System.out.println(building1);

        Building building2 = new Building.Builder()
                .withStoreyCount(5)
                .withAddress("ul. Osa 5")
                .withConstructionMaterial("Cegła")
                .build();
    }
}
