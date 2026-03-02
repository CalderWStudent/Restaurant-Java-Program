package Restaurants;

import MenuItems.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.join;

public class Restaurant {
    // Variables
    private String name;
    private int waitTime;
    private double averageRating;
    private double averagePrice;
    private double locationDistance;
    private String locationHours;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    // Constructor
    public Restaurant() {
    }

    // Constructor with variables

    public Restaurant(String name, int waitTime, double averageRating, double averagePrice, double locationDistance, String locationHours) {
        this.name = name;
        this.waitTime = waitTime;
        this.averageRating = averageRating;
        this.averagePrice = averagePrice;
        this.locationDistance = locationDistance;
        this.locationHours = locationHours;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public double getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(double locationDistance) {
        this.locationDistance = locationDistance;
    }

    public String getLocationHours() {
        return locationHours;
    }

    public void setLocationHours(String locationHours) {
        this.locationHours = locationHours;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addToMenuItems(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    // Override toString method to display Restaurants.Restaurant variables.
    public String toString() {
        ArrayList<String> menuItemsList = new ArrayList<>();
        for (MenuItem menuItem : menuItems) {
            menuItemsList.add(menuItem.toString());
        }

        return
            name +
            "\nWait time: " + waitTime + " minutes" +
            "\nAverage rating: " + averageRating +
            "\nAverage price: $" + averagePrice +
            "\nDistance: " + locationDistance + " miles" +
            "\nHours: " + locationHours +
            "\nMenu Items: " + join("\n", menuItemsList);


    }
}