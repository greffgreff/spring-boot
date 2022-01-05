package com.proximity.api;

import java.util.List;

import com.proximity.api.tomtomApi.TomtomApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	
	@GetMapping
	public List<String> getQueryResult() {
		TomtomApi tomtomApi = new TomtomApi();
		return tomtomApi.getData("beach");
	}
}
