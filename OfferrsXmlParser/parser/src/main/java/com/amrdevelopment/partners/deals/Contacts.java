package com.amrdevelopment.partners.deals;

import javax.xml.bind.annotation.XmlElement;

public class Contacts {
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    @XmlElement
    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
