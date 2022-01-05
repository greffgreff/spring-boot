package com.proximity.api;

import com.proximity.api.proximityApi.ProximityApi;
import com.proximity.api.tomtomApi.TomtomApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {
	
	private static TomtomApi tomtomApi;
	private static ProximityApi proximityApi;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		
		// Inits
		tomtomApi = new TomtomApi("r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC");
		proximityApi = new ProximityApi(tomtomApi);
	}
	
	@GetMapping
	public String getQueryResult() {
		return tomtomApi.getData("beach");
	}
}
