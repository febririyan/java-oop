package programmer.zaman.now.data;

public class Product {

    // protected hanya bisa di akses di turunannya dan di package yang sama
    public String name;
    public int price;

    // bikin constructor product
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product name: " + name + ", price: " + price;

    }

    // membuat hashCode
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    // ovveride equals method
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Product)) {
            return false;
        }

        // melakukan konversi kalo dia product
        Product product = (Product) o;

        if (this.price != product.price) {
            return false;
        }

        // kita cek
        if (this.name != null) {
            return this.name.equals(product.name);
        } else {
            return product.name == null;
        }
    }
    
}
