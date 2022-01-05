package com.proximity.api.tomtomApi.models;

public class ChargingPark {
    
    private String connectorType;
    private double ratedPowerKW;
    private int currentA;
    private String currentType;
    private int voltageV;

    public ChargingPark(String connectorType, double ratedPowerKW, int currentA, String currentType, int voltageV) {
        this.connectorType = connectorType;
        this.ratedPowerKW = ratedPowerKW;
        this.currentA = currentA;
        this.currentType = currentType;
        this.voltageV = voltageV;
    }
}
