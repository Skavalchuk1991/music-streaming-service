package lesson2.music.model;

import java.math.BigDecimal;

/**
 * Represents user subscription plan
 */
public class Subscription {

    // Type of subscription (Basic / Premium)
    private String type;

    // Monthly price of subscription (BigDecimal for precise monetary values)
    private BigDecimal monthlyPrice;

    /**
     * Constructor to initialize subscription
     */
    public Subscription(String type, BigDecimal monthlyPrice) {
        this.type = type;
        this.monthlyPrice = monthlyPrice;
    }

    // -------- Getters --------

    public String getType() {
        return type;
    }

    public BigDecimal getMonthlyPrice() {
        return monthlyPrice;
    }

    // -------- Setters --------

    public void setType(String type) {
        this.type = type;
    }

    public void setMonthlyPrice(BigDecimal monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }
}
