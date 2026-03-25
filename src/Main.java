import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Assign an ArrayList of Restaurants with the information read from a file.
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        try {
            readRestaurantsFromFile(restaurantList);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // Get the information from a random Restaurant and print it to the console.
        printRandomRestaurant(restaurantList);
    }

    // Loop through the "restaurants.txt" file using a Scanner to create Restaurants based on the information found in the file and add them to the restaurantList.
    private static void readRestaurantsFromFile(ArrayList<Restaurant> restaurantList) throws FileNotFoundException {
        File file = new File("src/restaurants.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            String name = scanner.next();
            int waitTime = scanner.nextInt();
            double rating = scanner.nextDouble();
            double averagePrice = scanner.nextDouble();
            double locationDistance = scanner.nextDouble();
            String locationHours = scanner.next();

            if (rating > 5.0) {
                rating = -1.0;
            }

            // Create a new Restaurant with variables based on the file information.
            Restaurant fileRestaurant = new Restaurant(name, rating, waitTime, averagePrice, locationDistance, locationHours);

            // Add the newly created Restaurant to the Restaurant ArrayList.
            restaurantList.add(fileRestaurant);
        }
    }

    //Prints a random Restaurant from the supplied ArrayList of Restaurants to the console for testing purposes.
    private static void printRandomRestaurant(ArrayList<Restaurant> restaurantList) {
        Random random = new Random();
        int restaurantCount = restaurantList.size();
        int randomIndex = random.nextInt(restaurantCount);
        System.out.println(restaurantList.get(randomIndex));
    }
}