package com.GeoStats.TomTomAdapter.poi;

import com.GeoStats.TomTomAdapter.TomtomApi;
import com.GeoStats.TomTomAdapter.poi.models.QueryResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoiServices {
    
    private final TomtomApi tomtomApiHandler;

    @Autowired
    public PoiServices(TomtomApi tomtomApiHandler) {
        this.tomtomApiHandler = tomtomApiHandler;
    }

    public String queryApi(String query) {
        return tomtomApiHandler.getDataFromQuery(query);
    }
    
    public QueryResult getParsedDataFromQuery(String query) {
        String json = queryApi(query);
        ObjectMapper mapper = new ObjectMapper();

        try {
            QueryResult result = mapper.readValue(json, QueryResult.class);
            return result;
        }
        catch(JsonProcessingException e) {
            System.out.println(e);
         }

        return null;
    }

    // private void getDefaultDataFromLocation() {
        
    // }
    
    // private void getDefaultData() {
        
    // }
}
