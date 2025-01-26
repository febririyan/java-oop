// class turunan atau pewarisan dari class manager

class VicePresident extends Manager {

    // kita harus buat constructor juga di child nya kalau di parent ada constructor
    VicePresident(String name) {
        super(name);
    }

    // deklarasikan method dari parent ke child class di namakan method overriding
    void sayHello(String name) {
        System.out.println("Hi, " + name + "My name is VP " + name);
    }
}
