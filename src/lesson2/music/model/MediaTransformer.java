package lesson2.music.model;

/**
 * Custom functional interface: transforms one type to another.
 */
@FunctionalInterface
public interface MediaTransformer<T, R> {
    R transform(T input);
}
