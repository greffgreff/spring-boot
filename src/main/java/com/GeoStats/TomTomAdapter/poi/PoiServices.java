package com.GeoStats.TomTomAdapter.poi;

import com.GeoStats.TomTomAdapter.TomtomApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoiServices {
    
    private final TomtomApi tomtomApiHandler;

    @Autowired
    public PoiServices(TomtomApi tomtomApiHandler) {
        this.tomtomApiHandler = tomtomApiHandler;
    }

    public String getParsedDataFromQuery(String query) {
        return tomtomApiHandler.getDataFromQuery(query);
    }

    // private void getDefaultDataFromLocation() {
        
    // }
    
    // private void getDefaultData() {
        
    // }
}
