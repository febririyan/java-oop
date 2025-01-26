package programmer.zaman.now.util;

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
}
