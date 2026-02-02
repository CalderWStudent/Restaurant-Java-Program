public class Main {
    public static void main(String[] args) {
        Restaurant burgerKing = new Restaurant(4, 4.3, 15, 10, "9 am - 11 pm");
        Restaurant wendys = new Restaurant(5, 4.5, 14, 15, "8 am - 10 pm");

        // Prints the wait time for both restaurants.
        System.out.println("Burger King Wait Time: " + burgerKing.waitTime + "m");
        System.out.println("Wendy's Wait Time: " + wendys.waitTime + "m");
    }
}
