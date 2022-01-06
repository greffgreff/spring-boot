package com.GeoStats.TomTomAdapter.poi.models;

import com.GeoStats.TomTomAdapter.poiExtras.models.ChargingPark;
import com.GeoStats.TomTomAdapter.poiExtras.models.EntryPoint;
import com.GeoStats.TomTomAdapter.poiExtras.models.Viewport;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "type", "relatedPois", "mapCodes", "id", "dataSources", "chargingPark", "entryPoints", "viewport", "info" })
public class PoiQueryResult {
    @JsonProperty("poi") private Poi poi;
    @JsonProperty("address") private Address address;
    @JsonProperty("score") private double score;
    @JsonProperty("distance") private double distance;
    @JsonProperty("position") private Position position;

    public PoiQueryResult() {}
    
    public PoiQueryResult(double score, double distance, Poi poi, Address address, Position position) {
        this.score = score;
        this.distance = distance;
        this.poi = poi;
        this.address = address;
        this.position = position;
    }

    public double getScore() {
        return score;
    }

    public double getDistance() {
        return distance;
    }

    public Address getAddress() {
        return address;
    }

    public Poi getPoi() {
        return poi;
    }

    public Position getPosition() {
        return position;
    }
}
