package com.GeoStats.TomTomAdapter._services;

import com.GeoStats.TomTomAdapter.TomtomApi;
import com.GeoStats.TomTomAdapter.dto.Poi;
import com.GeoStats.TomTomAdapter.dto.QueryPoi;
import com.GeoStats.TomTomAdapter.dto.QueryResult;
import com.GeoStats.TomTomAdapter.models.ResponsePoi;
import com.GeoStats.TomTomAdapter.models.RequestResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoiServices {
    
    private final TomtomApi tomtomApiHandler;

    @Autowired
    public PoiServices(TomtomApi tomtomApiHandler) {
        this.tomtomApiHandler = tomtomApiHandler;
    }

    public RequestResponse getRequestResponseFromQuery(String query) {
        QueryResult queryResult = getQueryResultFromQuery(query);
        RequestResponse response = new RequestResponse();
        response.setResponseCode(200);
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));
        List<ResponsePoi> responsePoiList = new ArrayList<>();
        assert queryResult != null;
        for (QueryPoi queryObj: queryResult.getResults()) {
            ResponsePoi poi = new ResponsePoi();
            Poi queryPoi = queryObj.getPoi();

            poi.setName(queryPoi.getName());
            poi.setPhone(queryPoi.getPhone());
            poi.setWebsite(queryPoi.getUrl());

            responsePoiList.add(poi);
        }
        response.setContent(responsePoiList.toArray());
        return response;
    }

    private QueryResult getQueryResultFromQuery(String query) {
        String finalQuery =  query != null && !query.isEmpty() ? query : "beach"; // handle null query string
        String json = tomtomApiHandler.getDataFromQuery(finalQuery);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, QueryResult.class);
        }
        catch (JsonProcessingException ignore) { }
        return null;
    }
}
