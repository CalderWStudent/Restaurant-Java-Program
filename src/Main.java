import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        // Assign an ArrayList to store Restaurants.
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        // Open a series of prompts and assign variables based on user input. Must be the correct data types.
        JOptionPane.showMessageDialog(
            null, "Please answer the following questions\nto list your results in the console.");
        String name = JOptionPane.showInputDialog(
                "Enter a name for the restaurant you would like to add:");
        double rating = Double.parseDouble(JOptionPane.showInputDialog(
            "Enter your rating for " + name + " from 0 to 5 (ex. 4.3): "));
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter the average wait time at " + name + " in whole minutes (ex. 3): "));
        double averagePrice = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the average price you spend at " + name + " (ex. 9.49): "));
        double locationDistance = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the distance to " + name + " in miles (ex. 2.0): "));
        String locationHours = JOptionPane.showInputDialog(
                "Enter the hours that " + name + " is open (ex. 8:00 am - 10:00 pm): ");

        // Create a new Restaurant with variables based on the user's input.
        Restaurant inputRestaurant = new Restaurant(name, rating, waitTime, averagePrice, locationDistance, locationHours);

        // Add the newly created Restaurant to the Restaurant ArrayList.
        restaurantList.add(inputRestaurant);

        // Print out the Restaurant's information by calling its toString method.
        for (Restaurant restaurant : restaurantList) {
            System.out.println("\n" + restaurant);
        }
    }
}