package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Merchant {

    private Integer id;
    private String name;
    private List<Contacts> contacts;

    public Integer getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    @XmlElement(name = "contacts")
    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
