package nl.ase_wayfinding.commons.model;

import java.io.Serializable;

/**
 * Represents the reward details.
 */
public class RewardDetails implements Serializable {

    private String couponCode;
    private double percentage;

    public RewardDetails() {}

    public RewardDetails(String couponCode, double percentage) {
        this.couponCode = couponCode;
        this.percentage = percentage;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "RewardDetails{" +
                "couponCode='" + couponCode + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
