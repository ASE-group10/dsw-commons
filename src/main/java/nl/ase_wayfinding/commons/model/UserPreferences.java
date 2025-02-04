package nl.ase_wayfinding.commons.model;

import java.io.Serializable;
import java.util.List;

/**
 * Represents user preferences.
 */
public class UserPreferences implements Serializable {

    private String userId;
    private List<String> preferredModes;
    private boolean notification;
    private String environmentalFocus;

    public UserPreferences() {}

    public UserPreferences(String userId, List<String> preferredModes, boolean notification, String environmentalFocus) {
        this.userId = userId;
        this.preferredModes = preferredModes;
        this.notification = notification;
        this.environmentalFocus = environmentalFocus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getPreferredModes() {
        return preferredModes;
    }

    public void setPreferredModes(List<String> preferredModes) {
        this.preferredModes = preferredModes;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String getEnvironmentalFocus() {
        return environmentalFocus;
    }

    public void setEnvironmentalFocus(String environmentalFocus) {
        this.environmentalFocus = environmentalFocus;
    }

    @Override
    public String toString() {
        return "UserPreferences{" +
                "userId='" + userId + '\'' +
                ", preferredModes=" + preferredModes +
                ", notification=" + notification +
                ", environmentalFocus='" + environmentalFocus + '\'' +
                '}';
    }
}
