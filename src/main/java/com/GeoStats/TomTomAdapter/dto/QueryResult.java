package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryResult {
    private QuerySummary summary;
    private QueryPoi[] results;

    public QueryResult() { }

    @JsonProperty("summary")
    public QuerySummary getSummary() {
        return summary;
    }

    @JsonProperty("results")
    public QueryPoi[] getResults() {
        return results;
    }
}
