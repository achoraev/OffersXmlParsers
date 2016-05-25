package com.amrdevelopment.partners.vipoferta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
public class Deals {
    private Set<Offer> deals;

    public Set<Offer> getDeals() {
        return deals;
    }

    @XmlElements({
            @XmlElement(name = "offer", type = Offer.class)
    })
    public void setDeals(Set<Offer> deals) {
        this.deals = deals;
    }
}
