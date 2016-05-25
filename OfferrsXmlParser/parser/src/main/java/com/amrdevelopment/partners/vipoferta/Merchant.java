package com.amrdevelopment.partners.vipoferta;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Merchant {

    private String name;
    private String email;
    private String website;
    private List<Contacts> contacts;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }
    @XmlElement
    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }
    @XmlElement
    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
