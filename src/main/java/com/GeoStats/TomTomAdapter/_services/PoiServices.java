package com.GeoStats.TomTomAdapter._services;

import com.GeoStats.TomTomAdapter.TomtomApi;
import com.GeoStats.TomTomAdapter.dto.Poi;
import com.GeoStats.TomTomAdapter.dto.QueryPoi;
import com.GeoStats.TomTomAdapter.dto.QueryResult;
import com.GeoStats.TomTomAdapter.models.Pagination;
import com.GeoStats.TomTomAdapter.models.ResponseBody;
import com.GeoStats.TomTomAdapter.models.ResponseContent;
import com.GeoStats.TomTomAdapter.models.ResponsePoi;
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

    public ResponseBody getResponseBody(String query) {
        QueryResult queryResult = getQueryFromApi(query);
        ResponseBody response = new ResponseBody();
        response.setTimestamp(new Timestamp(System.currentTimeMillis()));

        ResponseContent content = new ResponseContent();

        List<ResponsePoi> responsePoiList = new ArrayList<>();
        for (QueryPoi queryObj: queryResult.getResults()) {
            Poi queriedPoi = queryObj.getPoi();
            ResponsePoi.Builder builder = new ResponsePoi.Builder();
            builder.setName(queriedPoi.getName());
            builder.setPhone(queriedPoi.getPhone());
            builder.setWebsite(queriedPoi.getUrl());
            builder.setBrands(queriedPoi.getBrands());
            builder.setCategories(queriedPoi.getCategories());
            builder.setType(queriedPoi.getClassification());
            builder.setDistance(queryObj.getDistance());
            builder.setScore(queryObj.getScore());
            builder.setPosition(queryObj.getPosition());
            builder.setAddress(queryObj.getAddress());
            responsePoiList.add(builder.build());
        }

        Pagination pagination = new Pagination();
        pagination.setPageNumber(0);
        pagination.setResultCount(10);
        content.setPagination(pagination);
        content.setContent(responsePoiList.toArray());
        response.setResponseContent(content);

        return response;
    }

    private QueryResult getQueryFromApi(String query) {
        String rawJson = "";

        try {
            String route = "search/2/poiSearch";
            rawJson = tomtomApiHandler.makeApiRequest(route, query);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(rawJson, QueryResult.class);
        }
        catch (JsonProcessingException ignore) { }
        return null;
    }
}
