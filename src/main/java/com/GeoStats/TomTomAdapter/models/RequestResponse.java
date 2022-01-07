package com.GeoStats.TomTomAdapter.models;

import java.sql.Timestamp;

public class RequestResponse {
    private int responseCode;
    private Timestamp timestamp;
    private ResponseContent responseContent;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public ResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
