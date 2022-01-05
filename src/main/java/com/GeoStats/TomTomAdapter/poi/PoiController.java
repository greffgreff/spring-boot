package com.GeoStats.TomTomAdapter.poi;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/poi")
public class PoiController {
    
    private final PoiServices poiController;

    @Autowired
    public PoiController(PoiServices poiController) {
        this.poiController = poiController;
    }

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String getQueryResult(@RequestParam(required = false) String query) {
        return poiController.getParsedDataFromQuery(Optional.ofNullable(query).orElse("beach"));
	}
}
