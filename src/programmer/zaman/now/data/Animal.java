package programmer.zaman.now.data;

public abstract class Animal {
    public String name;

    // kalo kita membuat method harus di deklarasikan dengan blok tapi kalo menggunakan abstract method tidak boleh
    // kalau membuat abstract method wajib turunan dari animal ada abstract method
    public abstract void run();
}
