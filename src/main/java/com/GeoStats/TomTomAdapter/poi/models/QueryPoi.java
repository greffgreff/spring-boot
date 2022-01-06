package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "type", "id", "relatedPois", "mapCodes", "dataSources", "chargingPark", "entryPoints", "viewport", "info" })
public class QueryPoi {
    @JsonProperty("poi") private Poi poi;
    @JsonProperty("address") private Address address;
    @JsonProperty("score") private double score;
    @JsonProperty("distance") private double distance;
    @JsonProperty("position") private Position position;

    public QueryPoi() {}
    
    public QueryPoi(double score, double distance, Poi poi, Address address, Position position) {
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
