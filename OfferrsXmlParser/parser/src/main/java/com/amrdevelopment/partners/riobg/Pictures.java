package com.amrdevelopment.partners.riobg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class Pictures {

    private List<Pic> pictures;

    public List<Pic> getPictures() {
        return pictures;
    }

    @XmlElements({
            @XmlElement(name = "pic", type = Pic.class)
    })
    public void setPictures(List<Pic> pictures) {
        this.pictures = pictures;
    }
}
