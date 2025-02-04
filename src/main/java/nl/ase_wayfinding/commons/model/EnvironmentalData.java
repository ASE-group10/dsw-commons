package nl.ase_wayfinding.commons.model;

import java.io.Serializable;

/**
 * Represents the environmental data.
 */
public class EnvironmentalData implements Serializable {

    private double airQualityIndex;
    private double temperature;
    private double humidity;
    private String pollutantLevels;

    public EnvironmentalData() {}

    public EnvironmentalData(double airQualityIndex, double temperature, double humidity, String pollutantLevels) {
        this.airQualityIndex = airQualityIndex;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pollutantLevels = pollutantLevels;
    }

    public double getAirQualityIndex() {
        return airQualityIndex;
    }

    public void setAirQualityIndex(double airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getPollutantLevels() {
        return pollutantLevels;
    }

    public void setPollutantLevels(String pollutantLevels) {
        this.pollutantLevels = pollutantLevels;
    }

    @Override
    public String toString() {
        return "EnvironmentalData{" +
                "airQualityIndex=" + airQualityIndex +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pollutantLevels='" + pollutantLevels + '\'' +
                '}';
    }
}
