package lesson2.music.model;

/**
 * Abstract base class that represents any playable media
 * (Song, Podcast, etc.)
 */
public abstract class Media {

    // Title of media (name of song or podcast)
    private String title;

    // Duration in seconds
    private int duration;

    // Static block – runs once when class is loaded
    static {
        System.out.println("Media class loaded into memory");
    }

    /**
     * Constructor to initialize media fields
     */
    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    /**
     * Business method – simulate playing media
     */
    public void play() {
        System.out.println("Playing: " + title);
    }

    // --------- Getters ---------

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    // --------- Setters ---------

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
