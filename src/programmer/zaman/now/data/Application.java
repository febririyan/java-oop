package programmer.zaman.now.data;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengambil prosessor: ");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
