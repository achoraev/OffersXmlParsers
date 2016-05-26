package com.amrdevelopment.model;

import java.util.List;

/**
 * Created on 13-May-16
 */
public class MainOffer {

    private Integer Id;
    private String cities;
    private String categories;
    private String title;
    private String description;
    private String terms;
    private Price price;
    private Integer sold;
    private Validation validation;
    private String link;
    private List<Picture> pictures;
    private Merchant merchants;
    private List<Place> places;
    private Integer priority;
    private Integer rpvlt;
    private Integer rpv24;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Validation getValidation() {
        return validation;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public Merchant getMerchants() {
        return merchants;
    }

    public void setMerchants(Merchant merchants) {
        this.merchants = merchants;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getRpvlt() {
        return rpvlt;
    }

    public void setRpvlt(Integer rpvlt) {
        this.rpvlt = rpvlt;
    }

    public Integer getRpv24() {
        return rpv24;
    }

    public void setRpv24(Integer rpv24) {
        this.rpv24 = rpv24;
    }
}
