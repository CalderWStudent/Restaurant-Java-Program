package MenuItems;

public class Soda extends MenuItem {
    String sodaType;
    String size;
    double price;

    public Soda(String sodaType, String size, double price) {
        this.sodaType = sodaType;
        this.size = size;
        this.price = price;
    }

    public Soda(String sodaType, String size) {
        this.sodaType = sodaType;
        this.size = size;
    }

    public Soda(String size, double price) {
        this.sodaType = sodaType;
        this.size = size;
        this.price = price;
    }

    public void SetSodaType(String sodaType) {
        this.sodaType = sodaType;
    }
}