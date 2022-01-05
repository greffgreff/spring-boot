package com.GeoStats.TomTomAdapter.poi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomTomRoutes {
    
    private final TomtomApi tomtomApi;

    @Autowired
    public TomTomRoutes(String key) {
        this.tomtomApi = new TomtomApi(key);
    }

	@GetMapping
	public String getQueryResult() {
		return tomtomApi.getData("beach");
	}
}
