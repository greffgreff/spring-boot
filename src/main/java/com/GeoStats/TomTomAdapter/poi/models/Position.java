package com.GeoStats.TomTomAdapter.poi.models;

public class Position {
    private float[] position;        

    public Position(float lat, float lon) {
        position = new float[] { lat, lon };
    }

    public float[] getPosition() {
        return position;
    }
}