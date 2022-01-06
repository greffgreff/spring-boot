package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.*;

@JsonIgnoreProperties({ "categorySet" })
public class Poi {
    private String name;
    private String phone;
    private String[] brands;
    private String url;
    private String[] categories;
    private String classification;
    // open hours missing available on api

    public Poi() { }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("brands")
    public String[] brands() {
        return brands;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("categories")
    public String[] getCategories() {
        return categories;
    }

    @JsonProperty("classifications")
    private void getClassificationFromJsonNode(JsonNode classificationCodes) {
        classification = classificationCodes.get(0).get("code").asText();
    }

    public String getClassification() {
        return classification;
    }
}
