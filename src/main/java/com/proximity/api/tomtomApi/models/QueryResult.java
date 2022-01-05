package com.proximity.api.tomtomApi.models;

public class QueryResult {
    
    private QuerySummary summary;
    private PoiQueryResult[] queryResults;

    public QueryResult(QuerySummary summary, PoiQueryResult[] queryResults) {
        this.summary = summary;
        this.queryResults = queryResults;
    }
}
