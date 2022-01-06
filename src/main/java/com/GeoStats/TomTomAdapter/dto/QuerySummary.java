package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Arrays;

@JsonIgnoreProperties({ "queryType" })
public class QuerySummary {
    private String query;
    private int queryTime;
    private int offset;         // page
    private int numResults;     // results count
    private int totalResults;
    private int fuzzyLevel;
    private Position geoBias;
    private int[] position;

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
    public Position getGeoBias() {
        return geoBias;
    }

    @JsonProperty("geoBias")
    public void setPosition(JsonNode geoBias) {
        position = new int[]{geoBias.get("lat").asInt(), geoBias.get("lon").asInt()};
        System.out.println(Arrays.toString(position));
    }
}
