package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.util.List;

public class Prices {

    private List<Price> prices;

    public List<Price> getPrices() {
        return prices;
    }

    @XmlElements({
            @XmlElement(name = "price", type = Price.class)
    })
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
