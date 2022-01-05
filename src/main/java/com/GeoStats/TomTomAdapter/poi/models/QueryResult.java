package com.GeoStats.TomTomAdapter.poi.models;

public class QueryResult {
    private QuerySummary summary;
    private PoiQueryResult[] queryResults;

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
