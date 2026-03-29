package lesson2.music.model;

/**
 * Custom functional interface: performs an action on an item (no return).
 */
@FunctionalInterface
public interface MediaAction<T> {
    void execute(T item);
}
