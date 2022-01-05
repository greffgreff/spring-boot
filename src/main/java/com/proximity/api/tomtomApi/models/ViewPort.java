package com.proximity.api.tomtomApi.models;

public class ViewPort {
    
    private Position topLeftPoint;
    private Position btmRightPoint;

    public ViewPort(Position topLeftPoint, Position btmRightPoint) {
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
