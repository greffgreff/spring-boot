package com.proximity.api.tomtomApi.models;

public class EntryPoint {
    
    private String type;
    private Position position;

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
