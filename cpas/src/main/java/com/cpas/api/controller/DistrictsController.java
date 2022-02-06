package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.DistrictService;

@RestController
@RequestMapping("/api/ditrictsController/")
public class DistrictsController {
	
	private final DistrictService districtService;

	public DistrictsController(DistrictService districtService) {
		super();
		this.districtService = districtService;
	}
}
