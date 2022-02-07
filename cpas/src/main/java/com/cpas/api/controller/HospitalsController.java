package com.cpas.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.HospitalService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Hospital;

@RestController
@RequestMapping("/api/hospitalsController/")
public class HospitalsController {
	
	private final HospitalService hospitalService;

	public HospitalsController(HospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody @Valid Hospital hospital) {
		return this.hospitalService.add(hospital);
	}
	
	@PostMapping("delete")
	public Result delete(@RequestBody @Valid Hospital hospital) {
		return this.hospitalService.delete(hospital);
	}
	
	@GetMapping("getAll")
	public DataResult<List<Hospital>> getAll() {
		return this.hospitalService.getAll();
	}
	
	@GetMapping("getById")
	public Hospital getById(@RequestParam int id) throws NotFoundException {
		return this.hospitalService.getById(id);
	}
	
}
