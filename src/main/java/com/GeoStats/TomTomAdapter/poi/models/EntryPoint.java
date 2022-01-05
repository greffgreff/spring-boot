package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EntryPoint {
    @JsonProperty("type") private String type;
    @JsonProperty("position") private Position position;

    public EntryPoint() {}
    
    public EntryPoint(String type, Position position) {
        this.type = type;
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public Position getPosition() {
        return position;
    }
}
