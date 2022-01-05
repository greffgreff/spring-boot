package com.GeoStats.TomTomAdapter;

import com.GeoStats.TomTomAdapter.api.TomTomRoutes;
import com.GeoStats.TomTomAdapter.controllers.TomtomApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiApplication {
	
	private static TomtomApi tomtomApi;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);		
		TomTomRoutes tomTomRoutes = new TomTomRoutes("r6SBW2lsmjrN88T2GgG7ddAwmtmJiwiC");
	}
}
