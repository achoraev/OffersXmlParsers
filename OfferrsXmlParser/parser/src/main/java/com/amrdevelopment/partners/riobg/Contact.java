package com.amrdevelopment.partners.riobg;

import javax.xml.bind.annotation.XmlElement;

public class Contact {

    private String address;
    private String addressMore;
    private String phone;
    private double latitude;
    private double longtitude;

    public String getAddress() {
        return address;
    }

    @XmlElement
    public void setAddress(String address) {
        this.address = address.trim();
    }

    public String getAddressMore() {
        return addressMore;
    }

    @XmlElement(name = "address_more")
    public void setAddressMore(String addressMore) {
        this.addressMore = addressMore;
    }

    public String getPhone() {
        return phone;
    }

    @XmlElement
    public void setPhone(String phone) {
        this.phone = phone;
    }

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
