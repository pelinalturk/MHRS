package com.cpas.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.ClinicService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Clinic;

@RestController
@RequestMapping("/api/clinicsController/")
public class ClinicsController {
	
	private final ClinicService clinicService;

	public ClinicsController(ClinicService clinicService) {
		super();
		this.clinicService = clinicService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Clinic>>getAll(){
		return this.clinicService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@Valid @RequestBody Clinic clinic) {
		return this.clinicService.add(clinic);
	}
}
