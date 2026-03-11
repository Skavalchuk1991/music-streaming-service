package lesson2.music.model;

/**
 * PremiumUser is a special type of User
 * It extends User and adds extra functionality
 */
public class PremiumUser extends User {

    // Maximum number of downloads available
    private int downloadLimit;

    /**
     * Constructor for PremiumUser
     * Calls parent constructor using super()
     */
    public PremiumUser(String username, String email, Subscription subscription, int downloadLimit) {
        super(username, email, subscription); // calling constructor of User
        this.downloadLimit = downloadLimit;
    }

    /**
     * Business method: allows downloading a song
     */
    public void downloadSong(Song song) {
        if (downloadLimit > 0) {
            downloadLimit--;
            System.out.println("Downloaded: " + song.getTitle());
        } else {
            System.out.println("Download limit reached");
        }
    }

    public int getDownloadLimit() {
        return downloadLimit;
    }

    public void setDownloadLimit(int downloadLimit) {
        this.downloadLimit = downloadLimit;
    }
}