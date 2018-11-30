package exceptions;

public class EmailLengthException extends RuntimeException {

    public EmailLengthException() {
    }

    public EmailLengthException(String message) {
        super(message);

    }
}
