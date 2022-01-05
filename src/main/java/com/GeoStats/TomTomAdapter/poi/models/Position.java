package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
    @JsonProperty("position") private float[] position;        

    public Position(float lat, float lon) {
        position = new float[] { lat, lon };
    }

    public float[] getPosition() {
        return position;
    }
}
