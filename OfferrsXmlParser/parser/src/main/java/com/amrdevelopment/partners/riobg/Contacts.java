package com.amrdevelopment.partners.riobg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class Contacts {

    private List<Contact> contacts;

    public List<Contact> getContacts() {
        return contacts;
    }

    @XmlElements({
            @XmlElement(name = "contact", type = Contact.class)
    })
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
