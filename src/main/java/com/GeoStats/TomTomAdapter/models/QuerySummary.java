package com.GeoStats.TomTomAdapter.models;

public class QuerySummary {
    private String query;
    private String queryType;
    private int queryTime;
    private int numResults;
    private int offset;
    private int totalResults;
    private int fuzzyLevel;
    private Position geoBias;

    public QuerySummary(String query, String queryType, int queryTime, int numResults, int offset, int totalResults, int fuzzyLevel, Position geoBias) {
        this.query = query;
        this.queryType = queryType;
        this.queryTime = queryTime;
        this.numResults = numResults;
        this.offset = offset;
        this.totalResults = totalResults;
        this.fuzzyLevel = fuzzyLevel;
        this.geoBias = geoBias;
    }
}
