package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.HospitalService;

@RestController
@RequestMapping("/api/hospitalsController/")
public class HospitalsController {
	
	private final HospitalService hospitalService;

	public HospitalsController(HospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}
	
}
