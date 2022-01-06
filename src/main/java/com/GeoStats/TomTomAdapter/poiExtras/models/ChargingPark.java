package com.GeoStats.TomTomAdapter.poiExtras.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargingPark {
    @JsonProperty("connectorType") private String connectorType;
    @JsonProperty("relatedPowerKW") private double ratedPowerKW;
    @JsonProperty("currentA") private int currentA;
    @JsonProperty("currentType") private String currentType;
    @JsonProperty("voltageV") private int voltageV;

    public ChargingPark() {}

    public ChargingPark(String connectorType, double ratedPowerKW, int currentA, String currentType, int voltageV) {
        this.connectorType = connectorType;
        this.ratedPowerKW = ratedPowerKW;
        this.currentA = currentA;
        this.currentType = currentType;
        this.voltageV = voltageV;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public double getRatedPowerKW() {
        return ratedPowerKW;
    }

    public int getCurrentA() {
        return currentA;
    }

    public String getCurretnType() {
        return currentType;
    }

    public int getVoltageV() {
        return voltageV;
    }
}
