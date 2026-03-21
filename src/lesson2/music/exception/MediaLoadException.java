package lesson2.music.exception;

public class MediaLoadException extends Exception {
    public MediaLoadException(String message) {
        super(message);
    }

    public MediaLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
