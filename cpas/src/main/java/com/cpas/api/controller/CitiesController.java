package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.CityService;

@RestController
@RequestMapping("/api/citiesController")
public class CitiesController {
	
	private final CityService cityService;

	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
}
