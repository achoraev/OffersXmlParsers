package com.amrdevelopment.partners.deals;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Merchant {

    private String name;
    private List<Contacts> contacts;

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
