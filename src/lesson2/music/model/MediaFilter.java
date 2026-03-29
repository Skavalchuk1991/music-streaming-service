package lesson2.music.model;

/**
 * Custom functional interface: filters items by a condition.
 */
@FunctionalInterface
public interface MediaFilter<T> {
    boolean test(T item);
}
