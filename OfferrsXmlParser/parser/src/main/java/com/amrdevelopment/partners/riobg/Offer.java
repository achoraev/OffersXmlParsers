package com.amrdevelopment.partners.riobg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Offer {

    private String Id;
    private String categories;
    private String cities;
    private String link;
    private String title;
    private List<Pictures> pictures;
    private String description;
    private String terms;
    private Double promoPrice;
    private Double originalPrice;
    private String discount;
    private Integer soldAmount;
    private String end;
    private String updated;
    private List<Merchant> merchants;

    public String getId() {
        return Id;
    }

    @XmlElement
    public void setId(String id) {
        Id = id;
    }

    public String getCategories() {
        return categories;
    }

    @XmlElement
    public void setCategories(String categories) {
        this.categories = categories.trim();
    }

    public String getCities() {
        return cities;
    }

    @XmlElement
    public void setCities(String cities) {
        this.cities = cities.trim();
    }

    public String getLink() {
        return link;
    }

    @XmlElement
    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public List<Pictures> getPictures() {
        return pictures;
    }

    @XmlElement
    public void setPictures(List<Pictures> pictures) {
        this.pictures = pictures;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTerms() {
        return terms;
    }

    @XmlElement
    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    @XmlElement(name = "promo_price")
    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    @XmlElement(name = "original_price")
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscount() {
        return discount;
    }

    @XmlElement
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Integer getSoldAmount() {
        return soldAmount;
    }

    @XmlElement(name = "sold_amount")
    public void setSoldAmount(Integer soldAmount) {
        this.soldAmount = soldAmount;
    }

    public String getEnd() {
        return end;
    }

    @XmlElement
    public void setEnd(String end) {
        this.end = end;
    }

    public String getUpdated() {
        return updated;
    }

    @XmlElement
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<Merchant> getMerchants() {
        return merchants;
    }

    @XmlElement(name = "merchant")
    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }
}
