package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
    private float lat;
    private float lon;

    public Position() { }

    @JsonProperty("lon")
    public float getLon() {
        return lon;
    }

    @JsonProperty("lat")
    public float getLat() {
        return lat;
    }
}
