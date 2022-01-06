package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "classificationName" })
public class Classification {
    private String code;

    public Classification() {}

    public Classification(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
