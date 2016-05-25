package com.amrdevelopment.model;

/**
 * Created on 13-May-16
 */
public class Contact {

    private String address;
    private String addressMore;
    private String phone;
    private double latitude;
    private double longtitude;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressMore() {
        return addressMore;
    }

    public void setAddressMore(String addressMore) {
        this.addressMore = addressMore;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}
