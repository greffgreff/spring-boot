package com.GeoStats.TomTomAdapter.poiExtras.models;

import com.GeoStats.TomTomAdapter.poi.models.Position;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Viewport {
    @JsonProperty("topLeftPoint") private Position topLeftPoint;
    @JsonProperty("btmRightPoint") private Position btmRightPoint;

    public Viewport() {}
    
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
