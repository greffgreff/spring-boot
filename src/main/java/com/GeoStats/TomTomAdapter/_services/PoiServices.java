package com.GeoStats.TomTomAdapter._services;

import com.GeoStats.TomTomAdapter.TomtomApi;
import com.GeoStats.TomTomAdapter.dto.Address;
import com.GeoStats.TomTomAdapter.dto.Poi;
import com.GeoStats.TomTomAdapter.dto.QueryPoi;
import com.GeoStats.TomTomAdapter.dto.QueryResult;
import com.GeoStats.TomTomAdapter.models.Pagination;
import com.GeoStats.TomTomAdapter.models.ResponseContent;
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
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        ResponseContent content = new ResponseContent();

        List<ResponsePoi> responsePoiList = new ArrayList<>();
        assert queryResult != null;
        for (QueryPoi queryObj: queryResult.getResults()) {
            Poi queriedPoi = queryObj.getPoi();
            ResponsePoi poi = new ResponsePoi();
            poi.setName(queriedPoi.getName());
            poi.setPhone(queriedPoi.getPhone());
            poi.setWebsite(queriedPoi.getUrl());
            poi.setBrands(queriedPoi.getBrands());
            poi.setCategories(queriedPoi.getCategories());
            poi.setType(queriedPoi.getClassification());
            poi.setDistance(queryObj.getDistance());
            poi.setScore(queryObj.getScore());
            poi.setPosition(queryObj.getPosition());
            poi.setAddress(queryObj.getAddress());
            responsePoiList.add(poi);
        }

        Pagination pagination = new Pagination();
        pagination.setPageNumber(0);
        pagination.setResultCount(10);

        content.setPagination(pagination);
        content.setContent(responsePoiList.toArray());

        response.setResponseContent(content);

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
