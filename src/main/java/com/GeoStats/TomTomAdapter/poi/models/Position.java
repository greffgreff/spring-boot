package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
    @JsonProperty("lat") private float lat;        
    @JsonProperty("lon") private float lon;        

    public Position() {}
    
    public Position(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }
}
