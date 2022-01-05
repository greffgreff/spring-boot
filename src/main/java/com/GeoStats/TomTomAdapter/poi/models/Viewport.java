package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Viewport {
    @JsonProperty("topLeftPoint") private Position topLeftPoint;
    @JsonProperty("btmRightPoint") private Position btmRightPoint;

    public Viewport(Position topLeftPoint, Position btmRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.btmRightPoint = btmRightPoint;
    }

    public Position getTopLeftPoint() {
        return topLeftPoint;
    }

    public Position getBtmRightPoint() {
        return btmRightPoint;
    }
}
