package com.amrdevelopment.partners.vipoferta;

import javax.xml.bind.annotation.XmlElement;

public class Picture {
    private String pictureLink;

    public String getPictureLink() {
        return pictureLink;
    }

    @XmlElement(name = "pic")
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}
