package programmer.zaman.now.util;

import java.lang.reflect.Field;
import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        // jika ingin mengembalikan exception bisa menggunakan throw
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username jangan kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password jangan kosong");
        }
    }

    // runtime exception tidak wajib menggunakan throws
    public static void validateRuntime(LoginRequest loginRequest) {
        // jika ingin mengembalikan exception bisa menggunakan throw
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username jangan kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password jangan kosong");
        }
    }

    // membuat validasi reflection
    public static void validationReflection(Object object) {
        Class aclass = object.getClass();
        Field[] fields = aclass.getDeclaredFields();

        for (var field : fields) {
            // kan field ada yang ga bisa di akses maka jadikan
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                // validate
                try {
                    String value = (String) field.get(object);
                    // kita cek
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " " + "is Blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
