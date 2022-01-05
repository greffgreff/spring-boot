package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoiQueryResult {
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("score") private double score;
    @JsonProperty("distance") private double distance;
    @JsonProperty("info") private String info;
    @JsonProperty("poi") private Poi poi;
    @JsonProperty("relatedPois") private RelatedPoi[] relatedPois;
    @JsonProperty("mapCodes") private MapCode[] mapCodes;
    @JsonProperty("address") private Address address;
    @JsonProperty("position") private Position position;
    @JsonProperty("viewport") private Viewport viewport;
    @JsonProperty("entryPoints") private EntryPoint[] entryPoints;
    @JsonProperty("chargingPark") private ChargingPark[] chargingParks;
    @JsonProperty("dataSources") private DataSources dataSources;

    public PoiQueryResult() {}
    
    public PoiQueryResult(String type, String id, double score, double distance, String info, Poi poi, RelatedPoi[] relatedPois, MapCode[] mapCodes, Address address, Position position, Viewport viewport, EntryPoint[] entryPoints, ChargingPark[] chargingParks, DataSources dataSources) {
        this.type = type;
        this.id = id;
        this.score = score;
        this.distance = distance;
        this.info = info;
        this.poi = poi;
        this.relatedPois = relatedPois;
        this.mapCodes = mapCodes;
        this.address = address;
        this.position = position;
        this.viewport = viewport;
        this.entryPoints = entryPoints;
        this.chargingParks = chargingParks;
        this.dataSources = dataSources;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
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

    public String getInfo() {
        return info;
    }

    public Poi getPoi() {
        return poi;
    }

    public RelatedPoi[] getRelatedPois() {
        return relatedPois;
    }

    public MapCode[] getMapCodes() {
        return mapCodes;
    }

    public Position getPosition() {
        return position;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public EntryPoint[] getEntryPoints() {
        return entryPoints;
    }

    public ChargingPark[] getChargingParks() {
        return chargingParks;
    }
}
