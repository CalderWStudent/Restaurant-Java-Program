package MenuItems;

import java.util.ArrayList;

abstract public class Meal extends MenuItem {
    Size size;
    double price;
    ArrayList<MenuItem> items = new ArrayList<>();

    public Meal() {}

    public void AddItem(MenuItem item) {
        items.add(item);
    }

    public void AddItems(ArrayList<MenuItem> items) {
        for (MenuItem item : items) {
            AddItem(item);
        }
    }
}
