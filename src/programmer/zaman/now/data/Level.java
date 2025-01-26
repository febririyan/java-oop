package programmer.zaman.now.data;

public enum Level {
    // kebiasaan menggunakan huruf besar
    STANDARD ("Standard Level Hanya bisa 10 produk"),
    PREMIUM ("Premium Level Hanya bisa 30 produk"),
    VIP ("VIP Level Unlimited produk");

    private String description;

    // buat constructor
    Level(String description) {
        this.description = description;
    }

    // buat sebuah method
    public String getDescription() {
        return description;
    }
    
    
}
