package com.cpas.api.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.PatientService;
import com.cpas.domain.Patient;

@RestController
@RequestMapping("/api/patientsController")
public class PatientsController {
	
	private final PatientService patientService;

	public PatientsController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	@PostMapping("/add")
	public void add(@Valid @RequestBody Patient patient) {
		this.patientService.add(patient);
	}
}
