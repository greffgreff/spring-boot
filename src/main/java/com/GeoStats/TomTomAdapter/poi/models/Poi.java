package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Poi {
    @JsonProperty("name") private String name;
    @JsonProperty("phone") private String phone;
    @JsonProperty("brands") private String[] brands;
    @JsonProperty("url") private String url;
    @JsonProperty("categories") private String[] categories;
    @JsonProperty("classifications") private Classification[] classifications;
    @JsonProperty("categorySet") private CategorySet[] categorySet;

    public Poi() {}
    
    public Poi(String name, String phone, String[] brands, String url, String[] categories, Classification[] classifications, CategorySet[] categorySet) {
        this.name = name;
        this.phone = phone;
        this.brands = brands;
        this.url = url;
        this.categories = categories;
        this.classifications = classifications;
        this.categorySet = categorySet;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String[] brands() {
        return brands;
    }

    public String getWebsite() {
        return url;
    }

    public String[] getCategories() {
        return categories;
    }

    public Classification[] getClassifications() {
        return classifications;
    }
}
