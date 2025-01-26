// ini merupakan inheritence atau pewarisan class misal class orang tua bisa memiliki banyak class anak
// class anak hanya memiliki clas orang tua
// dan apabila si anak ingin mewarisi dari class orang tua maka di tambahkan extends dan di ikuti dengan class orang tua

class Manager extends Employee {

    String company;

    // kita buat constructor
    Manager(String name) {
        super(name);
    }

    // kalo constructor nya itu ada dua
    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi, " + name + "My name is Manager " + this.name);
    }
}
