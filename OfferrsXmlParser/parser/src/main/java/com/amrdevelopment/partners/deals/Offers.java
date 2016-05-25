package com.amrdevelopment.partners.deals;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
public class Offers {
    private Set<Offer> offers;

    public Set<Offer> getOffers() {
        return offers;
    }

    @XmlElements({
            @XmlElement(name = "offer", type = Offer.class)
    })
    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }
}
