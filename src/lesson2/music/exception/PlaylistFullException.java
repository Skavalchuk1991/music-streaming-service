package lesson2.music.exception;

public class PlaylistFullException extends RuntimeException {
    public PlaylistFullException(String message) {
        super(message);
    }
}
