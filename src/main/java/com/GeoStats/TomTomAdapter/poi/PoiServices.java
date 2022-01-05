package com.GeoStats.TomTomAdapter.poi;

import com.GeoStats.TomTomAdapter.TomtomApiHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoiServices {
    
    private final TomtomApiHandler tomtomApiHandler;

    @Autowired
    public PoiServices(TomtomApiHandler tomtomApiHandler) {
        this.tomtomApiHandler = tomtomApiHandler;
    }

    public String getParsedDataFrmoQuery(String query) {
        return tomtomApiHandler.getDataFromQuery(query);
    }
}
