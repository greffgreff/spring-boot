package com.GeoStats.TomTomAdapter.poiExtras.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "id" })
public class PoiDetail {
    @JsonProperty("sourceName") private String sourceName;

    public PoiDetail() {}

    public PoiDetail(String id, String sourceName) {
        this.sourceName = sourceName;
    }
}
