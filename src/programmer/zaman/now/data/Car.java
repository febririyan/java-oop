package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Lamborghini", tags = {"Mewah", "Mahal", "Luxury"})
public interface Car extends HashBrand, IsMaintenance {
    void drive();

    int getTier();


    // method default
    default boolean isBig() {
        return false;
    }
}
