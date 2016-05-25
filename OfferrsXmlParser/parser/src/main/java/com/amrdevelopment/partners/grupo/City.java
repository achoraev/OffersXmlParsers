package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class City {

    private Integer id;
    private String city;

    public Integer getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    @XmlValue
    public void setCity(String city) {
        this.city = city;
    }
}
