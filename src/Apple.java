public class Apple extends Fruits {
    private String skinColor = "Green";
    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Integer getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(Integer numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    private Integer numberOfLeaves = 0;
    private String countryOfOrigin = "Russia";
    public int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Apple(int p) {
        price = p;
    }
    @Override
    public String toString() {
        return name = "Яблоко";
    }

}
