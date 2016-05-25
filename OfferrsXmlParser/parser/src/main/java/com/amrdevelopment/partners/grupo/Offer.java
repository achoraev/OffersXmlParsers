package com.amrdevelopment.partners.grupo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Offer {

    private Integer Id;
    private String start;
    private String end;
    private String title;
    private String description;
    private String terms;
    private List<Categories> categories;
    private String link;
    private List<Images> images;
    private List<Places> places;
    private List<Prices> prices;
    private List<Merchant> merchants;

    public Integer getId() {
        return Id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        Id = id;
    }

    public String getStart() {
        return start;
    }

    @XmlElement
    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    @XmlElement
    public void setEnd(String end) {
        this.end = end;
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

    public List<Categories> getCategories() {
        return categories;
    }

    @XmlElement
    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public String getLink() {
        return link;
    }

    @XmlElement
    public void setLink(String link) {
        this.link = link;
    }

    public List<Images> getImages() {
        return images;
    }

    @XmlElement
    public void setImages(List<Images> images) {
        this.images = images;
    }

    public List<Places> getPlaces() {
        return places;
    }

    @XmlElement(name = "places")
    public void setPlaces(List<Places> places) {
        this.places = places;
    }

    public List<Prices> getPrices() {
        return prices;
    }

    @XmlElement
    public void setPrices(List<Prices> prices) {
        this.prices = prices;
    }

    public List<Merchant> getMerchants() {
        return merchants;
    }

    @XmlElement(name = "merchant")
    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }
}
