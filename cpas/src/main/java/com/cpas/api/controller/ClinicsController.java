package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.ClinicService;

@RestController
@RequestMapping("/api/clinicsController/")
public class ClinicsController {
	
	private final ClinicService clinicService;

	public ClinicsController(ClinicService clinicService) {
		super();
		this.clinicService = clinicService;
	}
	
}
