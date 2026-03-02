package MenuItems;

public interface HasSoda {
    Soda soda = new Soda("", "");

    public default void SetSodaType(String sodaType) {
        soda.sodaType = sodaType;
    }
}
