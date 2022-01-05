package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoiDetail {
    @JsonProperty("id") String id;
    @JsonProperty("sourceName") private String sourceName;

    public PoiDetail() {}

    public PoiDetail(String id, String sourceName) {
        this.id = id;
        this.sourceName = sourceName;
    }
}
