package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {
        
        // try {
        //     String names[] = {
        //         "Febry", "Sintia", "Riyan"
        //     };
        //     System.out.println(names[100]);
        // } catch (Throwable throwable) {
        //     throwable.getStackTrace();

        //     // atau bisa juga
        //     throwable.printStackTrace();
        // }

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError () {
        try {
            String names[] = {
                "Febry", "Sintia", "Riyan"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
