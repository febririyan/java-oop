public class PolymorphismApp {
    public static void main(String[] args) {

        // ini namanya polymorphism perubahan bentuk objeck menjadi bentuk yang lain
        // seperti Employee bisa berubah bentuk Manager atau VicePresident
        
        Employee employee = new Employee("Aina");
        employee.sayHello("Herlina ");

        employee = new Manager("Febry");
        employee.sayHello("Varhana ");

        employee = new VicePresident("Riyan");
        employee.sayHello("Anaa ");

        // ini untuk ringkas dalam memberi nama tanpa harus printout jadi menggunakan polymorphism seperti ini juga
        // Polymorphism bisa di set di dalam parameter method juga
        sayHello(new Employee("Hinata"));
        sayHello(new Manager("Febry"));
        sayHello(new VicePresident("Riyan"));
    }

    static void sayHello(Employee employee)
    {
        // melakukan pengecekan atau konversi tipe data
        // jangan salah akan terjadi error
        // Type check and Casts
        if (employee instanceof VicePresident) {
            System.out.println("Hello Vice President " + employee.name);
        } else if (employee instanceof Manager) {
            System.out.println("Hello Manager " + employee.name);
        } else {
            System.out.println("Hello," + employee.name);
        }
    }
}
