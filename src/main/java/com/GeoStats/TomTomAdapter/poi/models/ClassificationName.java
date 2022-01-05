package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassificationName {
    @JsonProperty("nameLocale") private String nameLocale;
    @JsonProperty("name") private String name;

    public ClassificationName() {}
    
    public ClassificationName(String nameLocale, String name) {
        this.nameLocale = nameLocale;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocaleName() {
        return nameLocale;
    }
}
