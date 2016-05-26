package com.amrdevelopment.parse;

import com.amrdevelopment.model.*;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created on 26-May-16
 */
@ParseClassName("ParseMainOffer")
public class ParseMainOffer extends ParseObject {

    private Validation validation;
    private List<Picture> pictures;
    private Merchant merchants;
    private List<Place> places;

    public ParseMainOffer () {}

    public Integer getId() {
        return getInt("id");
    }

    public void setId(Integer id) {
        put("id", id);
    }

    public String getCities() {
        return getString("cities");
    }

    public void setCities(String cities) {
        put("cities", cities);
    }

    public String getCategories() {
        return getString("categories");
    }

    public void setCategories(String categories) {
        put("categories", categories);
    }

    public String getTitle() {
        return getString("title");
    }

    public void setTitle(String title) {
        put("title", title);
    }

    public String getDescription() {
        return getString("description");
    }

    public void setDescription(String description) {
        put("description", description);
    }

    public String getTerms() {
        return getString("terms");
    }

    public void setTerms(String terms) {
        put("terms", terms);
    }

    public Integer getSold() {
        return getInt("sold");
    }

    public void setSold(Integer sold) {
        put("sold", sold);
    }

    public String getLink() {
        return getString("link");
    }

    public void setLink(String link) {
        put("link", link);
    }

    public Integer getPriority() {
        return getInt("priority");
    }

    public void setPriority(Integer priority) {
        put("priority", priority);
    }

    public Integer getRpvlt() {
        return getInt("rpvlt");
    }

    public void setRpvlt(Integer rpvlt) {
        put("rpvlt", rpvlt);
    }

    public Integer getRpv24() {
        return getInt("rpv24");
    }

    public void setRpv24(Integer rpv24) {
        put("rpv24", rpv24);
    }

    public static ParseQuery<ParseMainOffer> getQuery() {
        return ParseQuery.getQuery(ParseMainOffer.class);
    }
}
