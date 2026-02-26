package MenuItems;

import java.util.ArrayList;

abstract public class Meal extends MenuItem {
    String size = "";
    double price;
    ArrayList<MenuItem> items = new ArrayList<>();

    public Meal(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public void AddItem(MenuItem item) {
        items.add(item);
    }

    public void AddItems(ArrayList<MenuItem> items) {
        for (MenuItem item : items) {
            AddItem(item);
        }
    }
}
