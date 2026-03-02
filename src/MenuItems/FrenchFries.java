package MenuItems;

public class FrenchFries extends MenuItem {
    String size;

    public FrenchFries(String size, double price) {
        this.size = size;
        this.setPrice(price);
    }

    public FrenchFries(String size) {
        this.size = size;
    }
}
