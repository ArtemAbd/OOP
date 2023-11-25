public class Banana extends Fruits {
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

    private String skinColor;
    private Integer numberOfLeaves;
    private String countryOfOrigin;
    public int price;

    public Banana(int p) {
        price = p;
    }

    @Override
    public String toString() {
        return "Банан";
    }
}
