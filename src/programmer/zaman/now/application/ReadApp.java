package programmer.zaman.now.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {
        
        // mencoba membuat manual close resource
        // BufferedReader reader = null;

        // try {
        //     reader = new BufferedReader(
        //         new FileReader("README.md")
        //     );

        //     while (true) { 
        //         String line = reader.readLine();
        //         if (line == null) {
        //             break;
        //         }
        //         System.out.println(line);
        //     }
        // } catch (Throwable throwable) {
        //     System.out.println("Error membaca file" + throwable.getMessage());
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //             System.out.println("Sukses menutup");
        //         } catch (IOException exception) {
        //             System.out.println(exception.getMessage());
        //         }
        //     }
        // }

        // Fitur try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable exception){
            System.out.println("Gagal membaca file " + exception.getMessage());
        }

    }
}
