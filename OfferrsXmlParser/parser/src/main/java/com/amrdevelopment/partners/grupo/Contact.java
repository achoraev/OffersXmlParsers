package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlElement;

public class Contact {

    private String address;
    private String addressMore;
    private String phone;
    private double latitude;
    private double longitude;

    public String getAddress() {
        return address;
    }

    @XmlElement(name = "addres")
    public void setAddress(String address) {
        this.address = address;
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

    public double getLongitude() {
        return longitude;
    }

    @XmlElement(name = "longitude")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
