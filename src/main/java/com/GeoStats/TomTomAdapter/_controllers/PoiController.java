package com.GeoStats.TomTomAdapter._controllers;

import com.GeoStats.TomTomAdapter._services.PoiServices;
import com.GeoStats.TomTomAdapter.dto.QueryResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/poi")
public class PoiController {
    
    private final PoiServices poiServices;

    @Autowired
    public PoiController(PoiServices poiServices) {
        this.poiServices = poiServices;
    }

	@GetMapping
	public QueryResult getQueryResult(@RequestParam(required = false) String query) {
        return query != null && !query.isEmpty() ? poiServices.getParsedDataFromQuery(query) : poiServices.getParsedDataFromQuery("beach");
	}
}
