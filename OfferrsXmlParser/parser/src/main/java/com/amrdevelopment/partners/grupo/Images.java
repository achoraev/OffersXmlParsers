package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class Images {

    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    @XmlElements({
            @XmlElement(name = "image", type = Image.class)
    })
    public void setImages(List<Image> images) {
        this.images = images;
    }
}
