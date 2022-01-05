package com.GeoStats.TomTomAdapter.poi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/poi")
public class PoiController {
    
    private final PoiServices poiController;

    @Autowired
    public PoiController(PoiServices poiController) {
        this.poiController = poiController;
    }

	@GetMapping
	public String getQueryResult() {
		return poiController.getParsedDataFrmoQuery("beach");
	}
}
