package Restaurants;

import MenuItems.DoubleCheeseburgerMeal;
import MenuItems.FrenchFries;
import MenuItems.MenuItem;
import MenuItems.Soda;

import java.util.ArrayList;

public class BurgerKing extends Restaurant {

    public BurgerKing(String name, int waitTime, double averageRating, double averagePrice, double locationDistance, String locationHours) {
        this.setName(name);
        this.setWaitTime(waitTime);
        this.setAverageRating(averageRating);
        this.setAveragePrice(averagePrice);
        this.setLocationDistance(locationDistance);
        this.setLocationHours(locationHours);

        addToMenuItems(new DoubleCheeseburgerMeal());
        addToMenuItems(new FrenchFries());
        addToMenuItems(new Soda());
    };
}
