package com.amrdevelopment.partners.onfire;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Deal {

    private Integer affiliateDealId;
    private Integer priority;
    private String city;
    private String category;
    private String dealTitle;
    private String dealDescription;
    private String dealTerms;
    private String dealPhoto;
    private Double dealBasePrice;
    private Double dealBuyPrice;
    private Double dealPercentageDiscount;
    private Integer dealEndYear;
    private Integer dealEndMonth;
    private Integer dealEndDay;
    private Integer dealEndHour;
    private Integer dealEndMinute;
    private Integer dealEndSecond;
    private String dealUrl;
    private String dealCity;
    private String dealCityType;
    private String dealFullAddress;
    private String dealLeavingComplex;
    private String dealStreetName;
    private String dealAddressNumber;
    private String dealAddressEntrance;
    private Double googleLatitude;
    private Double googleLongitude;
    private String retailerName;
    private String retailerWebsite;
    private String retailerPhone;
    private String retailerMobile;
    private String retailerEmail;


    public Integer getAffiliateDealId() {
        return affiliateDealId;
    }

    @XmlElement(name = "affilate_deal_id")
    public void setAffiliateDealId(Integer affiliateDealId) {
        this.affiliateDealId = affiliateDealId;
    }

    public Integer getPriority() {
        return priority;
    }

    @XmlElement
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getCity() {
        return city;
    }

    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    @XmlElement
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDealTitle() {
        return dealTitle;
    }

    @XmlElement(name = "deal_title")
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    @XmlElement(name = "deal_description")
    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public String getDealTerms() {
        return dealTerms;
    }

    @XmlElement(name = "deal_terms")
    public void setDealTerms(String dealTerms) {
        this.dealTerms = dealTerms;
    }

    public String getDealPhoto() {
        return dealPhoto;
    }

    @XmlElement(name = "deal_photo")
    public void setDealPhoto(String dealPhoto) {
        this.dealPhoto = dealPhoto;
    }

    public Double getDealBasePrice() {
        return dealBasePrice;
    }
    @XmlElement(name = "deal_base_price")
    public void setDealBasePrice(Double dealBasePrice) {
        this.dealBasePrice = dealBasePrice;
    }

    public Double getDealBuyPrice() {
        return dealBuyPrice;
    }
    @XmlElement(name = "deal_buy_price")
    public void setDealBuyPrice(Double dealBuyPrice) {
        this.dealBuyPrice = dealBuyPrice;
    }

    public Double getDealPercentageDiscount() {
        return dealPercentageDiscount;
    }
    @XmlElement(name = "deal_percentage_discount")
    public void setDealPercentageDiscount(Double dealPercentageDiscount) {
        this.dealPercentageDiscount = dealPercentageDiscount;
    }

    public Integer getDealEndYear() {
        return dealEndYear;
    }
    @XmlElement(name = "deal_end_year")
    public void setDealEndYear(Integer dealEndYear) {
        this.dealEndYear = dealEndYear;
    }

    public Integer getDealEndMonth() {
        return dealEndMonth;
    }
    @XmlElement(name = "deal_end_month")
    public void setDealEndMonth(Integer dealEndMonth) {
        this.dealEndMonth = dealEndMonth;
    }

    public Integer getDealEndDay() {
        return dealEndDay;
    }
    @XmlElement(name = "deal_end_day")
    public void setDealEndDay(Integer dealEndDay) {
        this.dealEndDay = dealEndDay;
    }

    public Integer getDealEndHour() {
        return dealEndHour;
    }
    @XmlElement(name = "deal_end_hour")
    public void setDealEndHour(Integer dealEndHour) {
        this.dealEndHour = dealEndHour;
    }

    public Integer getDealEndMinute() {
        return dealEndMinute;
    }
    @XmlElement(name = "deal_end_minute")
    public void setDealEndMinute(Integer dealEndMinute) {
        this.dealEndMinute = dealEndMinute;
    }

    public Integer getDealEndSecond() {
        return dealEndSecond;
    }
    @XmlElement(name = "deal_end_second")
    public void setDealEndSecond(Integer dealEndSecond) {
        this.dealEndSecond = dealEndSecond;
    }

    public String getDealUrl() {
        return dealUrl;
    }
    @XmlElement(name = "deal_url")
    public void setDealUrl(String dealUrl) {
        this.dealUrl = dealUrl;
    }

    public String getDealCity() {
        return dealCity;
    }
    @XmlElement(name = "deal_city")
    public void setDealCity(String dealCity) {
        this.dealCity = dealCity;
    }

    public String getDealCityType() {
        return dealCityType;
    }
    @XmlElement(name = "deal_city_type")
    public void setDealCityType(String dealCityType) {
        this.dealCityType = dealCityType;
    }

    public String getDealFullAddress() {
        return dealFullAddress;
    }
    @XmlElement(name = "deal_full_address")
    public void setDealFullAddress(String dealFullAddress) {
        this.dealFullAddress = dealFullAddress;
    }

    public String getDealLeavingComplex() {
        return dealLeavingComplex;
    }
    @XmlElement(name = "deal_living_complex")
    public void setDealLeavingComplex(String dealLeavingComplex) {
        this.dealLeavingComplex = dealLeavingComplex;
    }

    public String getDealStreetName() {
        return dealStreetName;
    }
    @XmlElement(name = "deal_street_name")
    public void setDealStreetName(String dealStreetName) {
        this.dealStreetName = dealStreetName;
    }

    public String getDealAddressNumber() {
        return dealAddressNumber;
    }
    @XmlElement(name = "deal_address_number")
    public void setDealAddressNumber(String dealAddressNumber) {
        this.dealAddressNumber = dealAddressNumber;
    }

    public String getDealAddressEntrance() {
        return dealAddressEntrance;
    }
    @XmlElement(name = "deal_address_entrance")
    public void setDealAddressEntrance(String dealAddressEntrance) {
        this.dealAddressEntrance = dealAddressEntrance;
    }

    public Double getGoogleLatitude() {
        return googleLatitude;
    }
    @XmlElement(name = "google_latitude")
    public void setGoogleLatitude(Double googleLatitude) {
        this.googleLatitude = googleLatitude;
    }

    public Double getGoogleLongitude() {
        return googleLongitude;
    }
    @XmlElement(name = "google_longitude")
    public void setGoogleLongitude(Double googleLongitude) {
        this.googleLongitude = googleLongitude;
    }

    public String getRetailerName() {
        return retailerName;
    }
    @XmlElement(name = "retailer_name")
    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getRetailerWebsite() {
        return retailerWebsite;
    }
    @XmlElement(name = "retailer_website")
    public void setRetailerWebsite(String retailerWebsite) {
        this.retailerWebsite = retailerWebsite;
    }

    public String getRetailerPhone() {
        return retailerPhone;
    }
    @XmlElement(name = "retailer_phone")
    public void setRetailerPhone(String retailerPhone) {
        this.retailerPhone = retailerPhone;
    }

    public String getRetailerMobile() {
        return retailerMobile;
    }
    @XmlElement(name = "retailer_mobile")
    public void setRetailerMobile(String retailerMobile) {
        this.retailerMobile = retailerMobile;
    }

    public String getRetailerEmail() {
        return retailerEmail;
    }
    @XmlElement(name = "retailer_email")
    public void setRetailerEmail(String retailerEmail) {
        this.retailerEmail = retailerEmail;
    }
}
