package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlAttribute;

public class Image {

    private String link;

    public String getLink() {
        return link;
    }

    @XmlAttribute(name = "src")
    public void setLink(String link) {
        this.link = link;
    }
}
