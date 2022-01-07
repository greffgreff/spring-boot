package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties({ "queryType" })
public class QuerySummary {
    private String query;
    private int queryTime;
    private int offset;         // page
    private int numResults;     // results count
    private int totalResults;
    private int fuzzyLevel;
    private int[] geoBias;

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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setGeoBias(JsonNode geoBiasNode) {
        geoBias = new int[] { geoBiasNode.get("lat").asInt(), geoBiasNode.get("lon").asInt() };
    }

    public int[] getGeoBias() {
        return geoBias;
    }
}
