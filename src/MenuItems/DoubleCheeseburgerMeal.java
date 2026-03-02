package MenuItems;

import java.util.ArrayList;

public class DoubleCheeseburgerMeal extends Meal implements HasSoda {

    ArrayList<MenuItem> items = new ArrayList<>();

    public DoubleCheeseburgerMeal(String size, double price, String sodaType) {
        super(size, price);
        AddItem(new DoubleCheeseburger());
        AddItem(new FrenchFries(size));
        AddItem(soda);
    }

    public DoubleCheeseburgerMeal(String size, double price) {
        super(size, price);
        AddItem(new DoubleCheeseburger());
        AddItem(new FrenchFries(size));
        AddItem(new Soda("", size));
    }

    @Override
    public void SetSodaType(String sodaType) {
        HasSoda.super.SetSodaType(sodaType);
    }
}
