public class Restaurant {
    // Properties
    int waitTime;
    double averageRating;
    double averagePrice;
    double locationDistance;
    String locationHours;

    // Constructor
    public Restaurant() {

    }

    public Restaurant(int waitTime, double averageRating, double averagePrice, double locationDistance, String locationHours) {
        this.waitTime = waitTime;
        this.averageRating = averageRating;
        this.averagePrice = averagePrice;
        this.locationDistance = locationDistance;
        this.locationHours = locationHours;
    };
}