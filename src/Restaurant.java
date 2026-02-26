public class Restaurant {
    // Variables
    private String name;
    private double rating;
    private int waitTime;
    private double averagePrice;
    private double locationDistance;
    private String locationHours;

    // Constructor
    public Restaurant() {
    }

    // Constructor with variables

    public Restaurant(String name, double rating, int waitTime, double averagePrice, double locationDistance, String locationHours) {
        this.name = name;
        this.rating = rating;
        this.waitTime = waitTime;
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
        return rating;
    }
    public void setAverageRating(double averageRating) {
        this.rating = averageRating;
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

    // Override toString method to display Restaurant variables.
    public String toString() {
        return
            name +
            "\nYour rating: " + rating +
            "\nAverage wait time: " + waitTime + " minutes" +
            "\nAverage price: $" + averagePrice +
            "\nDistance: " + locationDistance + " miles" +
            "\nHours open: " + locationHours;
    }
}