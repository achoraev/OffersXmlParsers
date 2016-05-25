package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Categories {

    private List<Category> category;

    public List<Category> getCategory() {
        return category;
    }

    @XmlElement
    public void setCategory(List<Category> category) {
        this.category = category;
    }
}
