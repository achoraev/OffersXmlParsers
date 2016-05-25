package com.amrdevelopment.partners.onfire;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
public class Deals {
    private Set<Deal> deals;

    public Set<Deal> getDeals() {
        return deals;
    }

    @XmlElements({
            @XmlElement(name = "deal", type = Deal.class)
    })
    public void setDeals(Set<Deal> deals) {
        this.deals = deals;
    }
}
