package com.amrdevelopment.partners.vipoferta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Offer {

    private Integer Id;
    private String categories;
    private String cities;
    private String linkToOffer;
    private String title;
    private Integer priority;
    private List<Picture> pictures;
    private String description;
    private String terms;
    private Double promoPrice;
    private Double originalPrice;
    private Integer discountInPercent;
    private Integer soldAmount;
    private String end;
    private String validFrom;
    private String validTo;
    private String updated;
    private Merchant merchant;

    public Integer getId() {
        return Id;
    }

    @XmlElement
    public void setId(Integer id) {
        Id = id;
    }

    public String getCategories() {
        return categories;
    }
    @XmlElement
    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCities() {
        return cities;
    }
    @XmlElement
    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getLinkToOffer() {
        return linkToOffer;
    }
    @XmlElement(name = "link")
    public void setLinkToOffer(String linkToOffer) {
        this.linkToOffer = linkToOffer;
    }

    public String getTitle() {
        return title;
    }
    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPriority() {
        return priority;
    }
    @XmlElement
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public List<Picture> getPictures() {
        return pictures;
    }
    @XmlElement
    public void setPictures(List<Picture> pictures) {
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

    public Integer getDiscountInPercent() {
        return discountInPercent;
    }
    @XmlElement(name = "discount")
    public void setDiscountInPercent(Integer discountInPercent) {
        this.discountInPercent = discountInPercent;
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

    public String getValidFrom() {
        return validFrom;
    }
    @XmlElement
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }
    @XmlElement
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getUpdated() {
        return updated;
    }
    @XmlElement
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Merchant getMerchants() {
        return merchant;
    }
    @XmlElement(name = "merchant")
    public void setMerchants(Merchant merchant) {
        this.merchant = merchant;
    }
}
