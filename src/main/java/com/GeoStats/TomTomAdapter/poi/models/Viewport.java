package com.GeoStats.TomTomAdapter.pointsOfInterests.models;

public class Viewport {
    private Position topLeftPoint;
    private Position btmRightPoint;

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
