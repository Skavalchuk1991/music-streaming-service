package lesson2.music.model;

/**
 * Represents a system user
 */
public class User {

    // Username of the user
    private String username;

    // Email address
    private String email;

    // Each user has a subscription (composition)
    private Subscription subscription;

    /**
     * Constructor to initialize user
     */
    public User(String username, String email, Subscription subscription) {
        this.username = username;
        this.email = email;
        this.subscription = subscription;
    }

    // -------- Getters --------

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    // -------- Setters --------

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}