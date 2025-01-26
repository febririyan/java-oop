class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // ini adalah constructor dan namanya sama dengan class dan shadowing menghindari menggunakan keyword this
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // constructor overloading bisa buat banyak parameter yang penting berbeda jumlah atau tipe datanya
    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    

    void sayHello(String name, String address) {
        System.out.println("Hello " + name + "Nama saya " + this.name + " " + "Saya tinggal di " + this.address);
    }
}