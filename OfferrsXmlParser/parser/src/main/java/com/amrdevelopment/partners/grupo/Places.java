package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class Places {

    private List<City> places;

    public List<City> getPlaces() {
        return places;
    }

    @XmlElements({
            @XmlElement(name = "city", type = City.class)
    })
    public void setPlaces(List<City> places) {
        this.places = places;
    }
}
