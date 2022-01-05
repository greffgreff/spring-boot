package com.proximity.api.tomtomApi.models;

public class PoiQueryResult {
    
    private String type;
    private int id;
    private double score;
    private double discance;
    private String info;
    private Poi poi;
    private RelatedPoi[] relatedPois;
    private String mapCodes;
    private String address;
    private Position position;
    private ViewPort viewport;
    private EntryPoint[] entryPoints;
    private ChargingPark[] chargingParks;
}
