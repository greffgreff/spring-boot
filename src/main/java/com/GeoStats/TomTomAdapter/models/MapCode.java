package com.GeoStats.TomTomAdapter.models;

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
}
