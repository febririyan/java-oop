package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {

    @Fancy(name = "Method")
    public static void main(String[] args) {
        
        LoginRequest loginRequest = new LoginRequest(" ", "12345");

        // jika kita ingin memanggil validate exception kita bisa menggunakan Try-Catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception) {
            System.out.println("Terjadi error dengan pesan : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Terjadi error null pointer : " + exception.getMessage());
        } finally {
            System.out.println("Error ga error tetap di panggil");
        }

        // runtime exception tidak perlu menggunakan try catch
        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Sukses");


    }
}
