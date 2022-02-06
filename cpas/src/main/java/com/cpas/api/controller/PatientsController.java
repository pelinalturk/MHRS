package com.cpas.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.PatientService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
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
	public Result add(@Valid @RequestBody Patient patient) {
		return this.patientService.add(patient);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Patient>> getAll(){
		return this.patientService.getAll();
	}
	
	@GetMapping("/getById")
	public Patient getById(@RequestParam int id) throws NotFoundException{
		return this.patientService.getById(id);
	}
	
	@DeleteMapping("{id}")
	public Result delete(@PathVariable("id") int id) {
		return this.patientService.delete(id);
	}
}
