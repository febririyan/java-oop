package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabasesError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Febry", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabasesError("Tidak konek ke database");
        }
    }
}
