package MenuItems;

import java.util.ArrayList;

abstract public class MenuItem {
    private String name;
    private double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + "\n\t" +
               "Price:" + price;
    }
}