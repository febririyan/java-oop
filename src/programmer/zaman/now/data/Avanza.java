package programmer.zaman.now.data;

public class Avanza implements Car {
    // harus deklarasikan ulang
    @Override
    public void drive() {
        System.out.println("Avanza Drive");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean IsMaintenance() {
        return false;
    }

    

    
}
