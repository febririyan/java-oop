public class PersonApp {
    public static void main(String[] args) {

        // kegunaan constructor ingin memaksa harus memasukkan field nya
        var person1 = new Person("Febry", "Semarang");
        var person2 = new Person("Murni");
        var person3 = new Person();
    

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        System.out.println(person2.name);
        System.out.println(person3.name);


        person1.sayHello("Budi ", "Semarang");



    }
}
