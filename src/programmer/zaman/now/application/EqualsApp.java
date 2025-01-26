package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String frist = "Febry";
        frist = frist + " " + "Riyan";

        System.out.println(frist);

        String second = "Febry Riyan";
        System.out.println(second);

        System.out.println(frist.equals(second));
    }
}
