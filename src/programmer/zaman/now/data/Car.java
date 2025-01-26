package programmer.zaman.now.data;

public interface Car extends HashBrand, IsMaintenance {
    void drive();

    int getTier();


    // method default
    default boolean isBig() {
        return false;
    }
}
