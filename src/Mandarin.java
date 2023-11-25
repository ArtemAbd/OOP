public class Mandarin extends Fruits {
    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Integer getNumberyOfLeaves() {
        return numberyOfLeaves;
    }

    public void setNumberyOfLeaves(Integer numberyOfLeaves) {
        this.numberyOfLeaves = numberyOfLeaves;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String skinColor;
    private Integer numberyOfLeaves;

    private String countryOfOrigin;
    private String name;

    public int price;

    public Mandarin(int p) {
        price = p;
    }

    @Override
    public String toString() {
        return name = "Мандарин";
    }
}