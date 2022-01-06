package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "queryType" })
public class QuerySummary {
    private String query;
    private int queryTime;
    private int offset;         // page
    private int numResults;     // results count
    private int totalResults;
    private int fuzzyLevel;
    private Position geoBias;

    public QuerySummary() { }

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("queryTime")
    public int getQueryTime() {
        return queryTime;
    }

    @JsonProperty("offset")
    public int getOffset() {
        return offset;
    }

    @JsonProperty("numResults")
    public int getNumResults() {
        return numResults;
    }

    @JsonProperty("totalResults")
    public int getTotalResults() {
        return totalResults;
    }

    @JsonProperty("fuzzyLevel")
    public int getFuzzyLevel() {
        return fuzzyLevel;
    }

    @JsonProperty("geoBias")
    public Position getPosition() {
        return geoBias;
    }
}
