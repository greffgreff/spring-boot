package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    @JsonProperty("brands")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private void setBrandsFromJsonNode(JsonNode brandsNames) {
        List<String> brandsFromNode = new ArrayList<>();
        for (int i = 0; i < brandsNames.size(); ++i) {
            brandsFromNode.add(brandsNames.get(i).get("name").textValue());
        }
        brands = Arrays.copyOf(brandsFromNode.toArray(), brandsFromNode.toArray().length, String[].class);
    }

    public String[] getBrands() {
        return brands;
    }

    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    @JsonProperty("categories")
    public String[] getCategories() {
        return categories;
    } // clean categories

    @JsonProperty("classifications")
    private void setClassificationFromJsonNode(JsonNode classificationCodes) {
        classification = classificationCodes.get(0).get("code").asText();
    }

    public String getClassification() {
        return classification;
    }
}
