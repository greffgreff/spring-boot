package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryResult {
    @JsonProperty("summary") private QuerySummary summary;
    @JsonProperty("results") private PoiQueryResult[] queryResults;

    public QueryResult() {}
    
    public QueryResult(QuerySummary summary, PoiQueryResult[] queryResults) {
        this.summary = summary;
        this.queryResults = queryResults;
    }

    public QuerySummary getSummary() {
        return summary;
    }

    public PoiQueryResult[] getResults() {
        return queryResults;
    }
}
