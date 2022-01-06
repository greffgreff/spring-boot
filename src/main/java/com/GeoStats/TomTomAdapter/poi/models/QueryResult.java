package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryResult {
    @JsonProperty("summary") private QuerySummary summary;
    @JsonProperty("results") private QueryPoi[] queryResults;

    public QueryResult() {}

    public QueryResult(QuerySummary summary, QueryPoi[] queryResults) {
        this.summary = summary;
        this.queryResults = queryResults;
    }

    public QuerySummary getSummary() {
        return summary;
    }

    public QueryPoi[] getResults() {
        return queryResults;
    }
}
