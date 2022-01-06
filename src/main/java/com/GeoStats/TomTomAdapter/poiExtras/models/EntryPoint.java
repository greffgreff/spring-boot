package com.GeoStats.TomTomAdapter.poiExtras.models;

import com.GeoStats.TomTomAdapter.poi.models.Position;
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
