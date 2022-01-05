package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuerySummary {
    @JsonProperty("query") private String query;
    @JsonProperty("queryType") private String queryType;
    @JsonProperty("queryTime") private int queryTime;
    @JsonProperty("numResults") private int numResults;
    @JsonProperty("offset") private int offset;
    @JsonProperty("totalResults") private int totalResults;
    @JsonProperty("fuzzyLevel") private int fuzzyLevel;
    @JsonProperty("geoBias") private Position geoBias;

    public QuerySummary() {}
    
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

    public String getQuery() {
        return query;
    }

    public String getQueryType() {
        return queryType;
    }

    public int getQueryTime() {
        return queryTime;
    }

    public int getNumberOfResults() {
        return numResults;
    }

    public int getOffset() {
        return offset;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public int getFuzzyLevel() {
        return fuzzyLevel;
    }

    public Position getPosition() {
        return geoBias;
    }
}
