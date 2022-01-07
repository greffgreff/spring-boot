package com.GeoStats.TomTomAdapter.models;

import com.GeoStats.TomTomAdapter.interfaces.IResponseContent;

import java.sql.Timestamp;

public class RequestResponse implements IResponseContent {
    private int responseCode;
    private Timestamp timestamp;
    private Object[] content;

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

    public Object[] getContent() {
        return content;
    }

    public void setContent(Object[] content) {
        this.content = content;
    }
}
