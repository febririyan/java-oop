package programmer.zaman.now.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Rosalia Indah";
    }

    @Override
    public boolean IsMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
