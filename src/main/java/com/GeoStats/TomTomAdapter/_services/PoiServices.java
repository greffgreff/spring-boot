package com.GeoStats.TomTomAdapter._services;

import com.GeoStats.TomTomAdapter.TomtomApi;
import com.GeoStats.TomTomAdapter.dto.QueryResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoiServices {
    
    private final TomtomApi tomtomApiHandler;

    @Autowired
    public PoiServices(TomtomApi tomtomApiHandler) {
        this.tomtomApiHandler = tomtomApiHandler;
    }
    
    public QueryResult getParsedDataFromQuery(String query) {
        String json = tomtomApiHandler.getDataFromQuery(query);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, QueryResult.class);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
        return null;
    }
}
