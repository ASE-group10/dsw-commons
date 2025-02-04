package nl.ase_wayfinding.commons.model;

import java.io.Serializable;

/**
 * Represents the incident data.
 */
public class IncidentData implements Serializable {

    private String incidentId;
    private String type;
    private String description;
    private String timestamp; // ISO 8601 formatted string
    private String location;

    public IncidentData() {}

    public IncidentData(String incidentId, String type, String description, String timestamp, String location) {
        this.incidentId = incidentId;
        this.type = type;
        this.description = description;
        this.timestamp = timestamp;
        this.location = location;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "IncidentData{" +
                "incidentId='" + incidentId + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
