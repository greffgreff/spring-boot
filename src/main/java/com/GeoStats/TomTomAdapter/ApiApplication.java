package com.GeoStats.TomTomAdapter;

import com.GeoStats.TomTomAdapter.controllers.TomtomApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {
	
	private static TomtomApi tomtomApi;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		
		tomtomApi = new TomtomApi("r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC");
	}
	
	@GetMapping
	public String getQueryResult() {
		return tomtomApi.getData("beach");
	}
}
