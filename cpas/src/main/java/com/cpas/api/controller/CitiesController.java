package com.cpas.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.CityService;
import com.cpas.domain.City;

@RestController
@RequestMapping("/api/citiesController")
public class CitiesController {
	
	private final CityService cityService;

	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getAll")
	public List<City>getAll(){
		return this.cityService.getAll();
	}
}
