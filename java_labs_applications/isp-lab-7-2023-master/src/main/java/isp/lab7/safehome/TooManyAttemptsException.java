package isp.lab7.safehome;

import java.util.concurrent.ExecutionException;

public class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException(String message) {
        super(message);
    }
}
