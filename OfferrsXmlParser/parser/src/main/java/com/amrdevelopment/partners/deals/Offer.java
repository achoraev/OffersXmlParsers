package com.amrdevelopment.partners.deals;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Offer {

    private Integer Id;
    private String cities;
    private String categories;
    private String title;
    private String description;
    private String terms;
    private Double originalPrice;
    private Double promoPrice;
    private Integer discountInPercent;
    private Integer sold;
    private String end;
    private String updated;
    private String linkToOffer;
    private List<Picture> pictures;
    private List<Merchant> merchants;
    private Integer rpvlt;
    private Integer rpv24;
    private Integer priority;

    public Integer getId() {
        return Id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        Id = id;
    }

    public String getCities() {
        return cities;
    }

    @XmlElement
    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getCategories() {
        return categories;
    }

    @XmlElement
    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
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

    public Double getOriginalPrice() {
        return originalPrice;
    }

    @XmlElement(name = "original_price")
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    @XmlElement(name = "promo_price")
    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Integer getDiscountInPercent() {
        return discountInPercent;
    }

    @XmlElement(name = "discount")
    public void setDiscountInPercent(Integer discountInPercent) {
        this.discountInPercent = discountInPercent;
    }

    public Integer getSold() {
        return sold;
    }

    @XmlElement
    public void setSold(Integer sold) {
        this.sold = sold;
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

    public String getLinkToOffer() {
        return linkToOffer;
    }

    @XmlElement(name = "link")
    public void setLinkToOffer(String linkToOffer) {
        this.linkToOffer = linkToOffer;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    @XmlElement
    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Merchant> getMerchants() {
        return merchants;
    }

    @XmlElement(name = "merchant")
    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }

    public Integer getRplt() {
        return rpvlt;
    }

    @XmlElement
    public void setRplt(Integer rpvlt) {
        this.rpvlt = rpvlt;
    }

    public Integer getRpv24() {
        return rpv24;
    }

    @XmlElement
    public void setRpv24(Integer rpv24) {
        this.rpv24 = rpv24;
    }

    public Integer getPriority() {
        return priority;
    }

    @XmlElement
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
