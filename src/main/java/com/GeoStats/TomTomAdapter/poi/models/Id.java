package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Id {
    @JsonProperty("id") String id;

    public Id() {}

    public Id(String id) {
        this.id = id;
    }
}
