package lesson2.music.model;

/**
 * Represents a playlist that contains media items
 */
public class Playlist {

    // Name of playlist
    private String name;

    // Playlist can contain different types of Media (Song, Podcast)
    private Media[] items;

    /**
     * Constructor
     */
    public Playlist(String name, Media[] items) {
        this.name = name;
        this.items = items;
    }

    /**
     * Business method:
     * Calculates total duration of all media in playlist
     */
    public int calculateTotalDuration() {
        int total = 0;

        for (Media media : items) {
            total += media.getDuration();
        }

        return total;
    }

    // -------- Getters --------

    public String getName() {
        return name;
    }

    public Media[] getItems() {
        return items;
    }

    // -------- Setters --------

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(Media[] items) {
        this.items = items;
    }
}