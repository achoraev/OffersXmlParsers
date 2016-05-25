package com.amrdevelopment.partners.deals;

import javax.xml.bind.annotation.XmlElement;

public class Contact {

    private double latitude;
    private double longtitude;

    public double getLatitude() {
        return latitude;
    }

    @XmlElement
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    @XmlElement
    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }
}
