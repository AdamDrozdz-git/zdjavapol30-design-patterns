package pl.sdacademy.designpatterns.creational.buldier;

public class Building {
    private int area;
    private int height;
    private String address;
    private String constructionMaterial;
    private int storeyCount;

    private Building(int area, int height, String address, String constructionMaterial, int storeyCount) {
        this.area = area;
        this.height = height;
        this.address = address;
        this.constructionMaterial = constructionMaterial;
        this.storeyCount = storeyCount;
    }

    @Override
    public String toString() {
        return "Building{" +
                "area=" + area +
                ", height=" + height +
                ", address='" + address + '\'' +
                ", constructionMaterial='" + constructionMaterial + '\'' +
                ", storeyCount=" + storeyCount +
                '}';
    }
    public static class Builder {
        private int area;
        private int height;
        private String address;
        private String constructionMaterial;
        private int storeyCount;
        
        public Builder withArea(int area){
            this.area = area;
            return this;
        }

        public Builder withHeight(int height){
            this.height = height;
            return this;
        }

        public Builder withAddress(String address){
            this.address = address;
            return this;
        }

        public Builder withConstructionMaterial(String constructionMaterial){
            this.constructionMaterial = constructionMaterial;
            return this;
        }

        public Builder withStoreyCount(int storeyCount){
            this.storeyCount = storeyCount;
            return this;
        }

        public Building build(){
            return new Building(area, height, address, constructionMaterial, storeyCount);
        }
    }
}
