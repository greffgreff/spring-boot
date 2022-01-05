package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MapCode {
    @JsonProperty("type") private String type;
    @JsonProperty("fullMapCode") private String fullMapCode;
    @JsonProperty("territory") private String territory;
    @JsonProperty("code") private String code;

    public MapCode(String type, String fullMapCode, String territory, String code) {
        this.type = type;
        this.fullMapCode = fullMapCode;
        this.territory = territory;
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public String getFullMapCode() {
        return fullMapCode;
    }

    public String getTerritory() {
        return territory;
    }

    public String getCode() {
        return code;
    }
}
