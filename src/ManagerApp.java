// mengakses dari pewarisan tadi

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Bejo");
        manager.sayHello("Burhan ");

        var vicepresident = new VicePresident("Talina");
        vicepresident.sayHello("Ananta ");

        System.out.println(manager.toString());
        System.out.println(manager);
    }
}
