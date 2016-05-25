package com.amrdevelopment.partners.deals;

import javax.xml.bind.annotation.XmlElement;

public class Picture {
    private String pictureLink;

    public String getPictureLink() {
        return pictureLink;
    }

    @XmlElement(name = "picture")
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}
