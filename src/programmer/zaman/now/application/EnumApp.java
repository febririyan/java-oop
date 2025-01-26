package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        
        Customer customer = new Customer();
        customer.setName("Budi");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription());

        // konversi dari enum ke string
        String levelName = Level.PREMIUM.name();
        System.out.println(levelName);

        // konversi menjadi level
        Level level = Level.valueOf("STANDARD"); 
        System.out.println(level);

        // cara lihat levelnya apa saja
        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
