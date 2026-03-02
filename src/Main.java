import Restaurants.BurgerKing;
import Restaurants.Restaurant;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        // Create an ArrayList of Restaurants
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        // Open prompts and assign variables based on user input.
//        String name = JOptionPane.showInputDialog(
//                "Enter a name for the restaurant:");
//        int waitTime = Integer.parseInt(JOptionPane.showInputDialog(
//                "Enter the wait time for " + name + " in minutes: "));
//        double averageRating = Double.parseDouble(JOptionPane.showInputDialog(
//                "Enter average rating for " + name + " (ex. 4.3): "));
//        double averagePrice = Double.parseDouble(JOptionPane.showInputDialog(
//                "Enter the average price for " + name + ": "));
//        double locationDistance = Double.parseDouble(JOptionPane.showInputDialog(
//                "Enter the distance to " + name + " in miles: "));
//        String locationHours = JOptionPane.showInputDialog(
//                "Enter the hours for " + name + " (ex. 8:00 am - 10:00 pm): ");
//
//        // Create a Restaurants.Restaurant with variables based on user input.
//        Restaurant inputRestaurant = new Restaurant(name, waitTime, averageRating, averagePrice, locationDistance, locationHours);

        // Add the Input Restaurants.Restaurant to the Restaurants.Restaurant List
//        restaurantList.add(inputRestaurant);
        restaurantList.add(new BurgerKing("Burger King", 3, 4.5, 7.32, 3, "9:00 am - 10:00 pm"));

        // Print out the Restaurants.Restaurant's variables.
        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant + "\n");
        }
    }
}