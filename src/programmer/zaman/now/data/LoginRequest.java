package programmer.zaman.now.data;

// java record tidak bisa extends hanya bisa interface implements
public record LoginRequest(String username, String password) {
    // kalo ingin membuat constructor tanda kurung tutup di hapus
    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    // menambahkan overloading
    public LoginRequest (String username) {
        this(username, " ");
    }

    public LoginRequest () {
        this(" ", " ");
    }

    // disini kalo mau nambah method juga bisa
    public void sayHello () {
        // System.out.println("");
    }
}
