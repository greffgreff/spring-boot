package com.GeoStats.TomTomAdapter.models;

import com.GeoStats.TomTomAdapter.interfaces.IResponseContent;
import jdk.jfr.Timestamp;

public class RequestResponse {

    private final int responseCode;
    private final Timestamp timestamp;
    private final IResponseContent content;

    public RequestResponse(int responseCode, Timestamp timestamp, IResponseContent content) {
        this.responseCode = responseCode;
        this.timestamp = timestamp;
        this.content = content;
    }
}
