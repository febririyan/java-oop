package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();

        category.setId("ID");
        category.setId(null);

        // sekarang ketika mengambil id jadi get id
        System.out.println(category.getId());
    }
}
