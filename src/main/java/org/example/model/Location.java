package org.example.model;
import javax.persistence.*;
import java.util.UUID;
@Entity//kot
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//kot
    private UUID id;
    private  String region;
    private String country;
    private double latitude, longtitude;

    public Location() {
    }

    public Location(UUID id, String region, String country, double latitude, double longtitude) {
        this.id = id;
        this.region = region;
        this.country = country;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longtitude=" + longtitude +
                '}';
    }
}
