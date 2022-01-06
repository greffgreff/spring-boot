package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "type", "id", "relatedPois", "mapCodes", "dataSources", "chargingPark", "entryPoints", "viewport", "info" })
public class QueryPoi {
    private Poi poi;
    private Address address;
    private double score;
    private double distance;
    private Position position;

    public QueryPoi() { }

    @JsonProperty("score")
    public double getScore() {
        return score;
    }

    @JsonProperty("distance")
    public double getDistance() {
        return distance;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("poi")
    public Poi getPoi() {
        return poi;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }
}
