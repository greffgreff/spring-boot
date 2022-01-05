package com.GeoStats.TomTomAdapter.api;

import com.GeoStats.TomTomAdapter.controllers.TomtomApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomTomRoutes {
    
    private final TomtomApi tomtomApi;

    public TomTomRoutes(String key) {
        this.tomtomApi = new TomtomApi(key);
    }
    
	@GetMapping
	public String getQueryResult() {
		return tomtomApi.getData("beach");
	}
}
