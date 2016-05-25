package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Category {

    private Integer id;
    private String category;

    public Integer getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    @XmlValue
    public void setCategory(String category) {
        this.category = category;
    }
}
