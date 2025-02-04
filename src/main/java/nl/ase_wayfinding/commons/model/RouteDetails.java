package nl.ase_wayfinding.commons.model;

import java.io.Serializable;

/**
 * Represents the details of a route.
 */
public class RouteDetails implements Serializable {

    private String routeId;
    private String startPoint;
    private String endPoint;
    private int noOfStops;
    private String transportationMode;
    private double sustainabilityIndex;

    // Default constructor
    public RouteDetails() {}

    // All arguments constructor
    public RouteDetails(String routeId, String startPoint, String endPoint, int noOfStops,
                        String transportationMode, double sustainabilityIndex) {
        this.routeId = routeId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.noOfStops = noOfStops;
        this.transportationMode = transportationMode;
        this.sustainabilityIndex = sustainabilityIndex;
    }

    // Getters and setters
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public int getNoOfStops() {
        return noOfStops;
    }

    public void setNoOfStops(int noOfStops) {
        this.noOfStops = noOfStops;
    }

    public String getTransportationMode() {
        return transportationMode;
    }

    public void setTransportationMode(String transportationMode) {
        this.transportationMode = transportationMode;
    }

    public double getSustainabilityIndex() {
        return sustainabilityIndex;
    }

    public void setSustainabilityIndex(double sustainabilityIndex) {
        this.sustainabilityIndex = sustainabilityIndex;
    }

    @Override
    public String toString() {
        return "RouteDetails{" +
                "routeId='" + routeId + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", noOfStops=" + noOfStops +
                ", transportationMode='" + transportationMode + '\'' +
                ", sustainabilityIndex=" + sustainabilityIndex +
                '}';
    }
}
