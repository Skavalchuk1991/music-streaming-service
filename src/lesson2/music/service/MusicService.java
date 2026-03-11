package lesson2.music.service;

import lesson2.music.model.Media;
import lesson2.music.model.User;

/**
 * Core service of the music streaming system
 */
public class MusicService {

    // Catalog of available media (Songs and Podcasts)
    private Media[] catalog;

    // Registered users
    private User[] users;

    /**
     * Constructor
     */
    public MusicService(Media[] catalog, User[] users) {
        this.catalog = catalog;
        this.users = users;
    }

    /**
     * Business method:
     * Streams media for a user
     */
    public void streamMedia(User user, Media media) {

        System.out.println(user.getUsername() + " is streaming: " + media.getTitle());

        // Call media play method (polymorphism)
        media.play();

        // Increase global streaming counter
        StreamingStatistics.increaseCounter();
    }

    public Media[] getCatalog() {
        return catalog;
    }

    public User[] getUsers() {
        return users;
    }

    public void setCatalog(Media[] catalog) {
        this.catalog = catalog;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    /**
     * Adds new user to the system.
     * Since arrays have fixed size, we create a new array
     * and copy existing users into it.
     */
    public void addUser(User newUser) {

        User[] newUsers = new User[users.length + 1];

        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }

        newUsers[users.length] = newUser;

        users = newUsers;
    }

    /**
     * Adds new media to catalog.
     * Creates a new array and copies old media items.
     */
    public void addMedia(Media newMedia) {

        Media[] newCatalog = new Media[catalog.length + 1];

        for (int i = 0; i < catalog.length; i++) {
            newCatalog[i] = catalog[i];
        }

        newCatalog[catalog.length] = newMedia;

        catalog = newCatalog;
    }
}