package MenuItems;

public class Soda extends MenuItem {
    String sodaType;
    Size size;
    double price;

    public Soda() {}

    public Soda(String sodaType, Size size, double price) {
        this.sodaType = sodaType;
        this.size = size;
        this.price = price;
    }

    public Soda(String sodaType, Size size) {
        this.sodaType = sodaType;
        this.size = size;
    }

    public Soda(Size size, double price) {
        this.sodaType = sodaType;
        this.price = price;
    }

    public void SetSodaType(String sodaType) {
        this.sodaType = sodaType;
    }
}