package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "price")
public class Price {

    private Integer id;
    private Double price;
    private Double priceSale;
    private Integer discount;
    private String priceData;

    public Integer getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    @XmlAttribute
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceSale() {
        return priceSale;
    }

    @XmlAttribute(name = "price_sale")
    public void setPriceSale(Double priceSale) {
        this.priceSale = priceSale;
    }

    public Integer getDiscount() {
        return discount;
    }

    @XmlAttribute
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getPriceData() {
        return priceData;
    }

    @XmlValue
    public void setPriceData(String priceData) {
        this.priceData = priceData;
    }
}
