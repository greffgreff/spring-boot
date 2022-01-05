package com.GeoStats.TomTomAdapter.poi.models;

public class PoiQueryResult {
    private String type;
    private int id;
    private double score;
    private double distance;
    private String info;
    private Poi poi;
    private RelatedPoi[] relatedPois;
    private MapCode[] mapCodes;
    private String address;
    private Position position;
    private Viewport viewport;
    private EntryPoint[] entryPoints;
    private ChargingPark[] chargingParks;

    public PoiQueryResult(String type, int id, double score, double distance, String info, Poi poi, RelatedPoi[] relatedPois, MapCode[] mapCodes, String address, Position position, Viewport viewport, EntryPoint[] entryPoints, ChargingPark[] chargingParks) {
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
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public double getDistance() {
        return distance;
    }

    public String getAddress() {
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
