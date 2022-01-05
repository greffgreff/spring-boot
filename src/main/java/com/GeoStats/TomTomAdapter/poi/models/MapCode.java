package com.GeoStats.TomTomAdapter.poi.models;

public class MapCode {
    private String type;
    private String fullMapCode;
    private String territory;
    private String code;

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
