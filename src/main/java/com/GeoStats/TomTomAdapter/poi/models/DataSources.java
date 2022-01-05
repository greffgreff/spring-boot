package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSources {
    @JsonProperty("chargingAvailability") private Id chargingAvailability;
    @JsonProperty("geometry") private Id geometry;
    @JsonProperty("poiDetails") private PoiDetail[] poiDetails;

    public DataSources() {}

    public DataSources(Id chargingAvailability, Id geometry, PoiDetail[] poiDetails) {
        this.chargingAvailability = chargingAvailability;
        this.geometry = geometry;
        this.poiDetails = poiDetails;
    }
}
