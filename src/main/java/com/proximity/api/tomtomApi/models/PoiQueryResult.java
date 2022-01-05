package com.proximity.api.tomtomApi.models;

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
}
