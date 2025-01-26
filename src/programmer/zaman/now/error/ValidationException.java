package programmer.zaman.now.error;

// exception merupakan cclas untuk membuat erro yang mana super class nya extends ke Throwble
public class ValidationException extends Throwable {

    private String message;

    public ValidationException (String message) {
        super(message);
    }
    
}
