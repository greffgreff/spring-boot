package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Poi {
    @JsonProperty("name") private String name;
    @JsonProperty("phone") private String phone;
    @JsonProperty("brands") private String[] brands;
    @JsonProperty("url") private String url;

    public Poi(String name, String phone, String[] brands, String url) {
        this.name = name;
        this.phone = phone;
        this.url = url;
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
}
