package com.GeoStats.TomTomAdapter.models;

import java.sql.Timestamp;

public class ResponseBody {
    private Timestamp timestamp;
    private ResponseContent responseContent;

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
