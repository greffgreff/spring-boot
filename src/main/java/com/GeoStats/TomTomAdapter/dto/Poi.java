package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @JsonProperty("brands")
    private void setBrandsFromJsonNode(JsonNode brandsNames) {
        List<String> brandsFromNode = new ArrayList<>();
        for (int i = 0; i < brandsNames.size(); ++i) {
            brandsFromNode.add(brandsNames.get(i).get("name").toString());
        }
        brands = Arrays.copyOf(brandsFromNode.toArray(), brandsFromNode.toArray().length, String[].class);
        System.out.println(brands.toString());
    }

    public String[] getBrands() {
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
    private void setClassificationFromJsonNode(JsonNode classificationCodes) {
        classification = classificationCodes.get(0).get("code").asText();
    }

    public String getClassification() {
        return classification;
    }
}
