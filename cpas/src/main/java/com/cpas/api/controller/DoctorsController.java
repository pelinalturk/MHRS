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

import com.cpas.business.abstracts.DoctorService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Doctor;

@RestController
@RequestMapping("/api/doctorsController")
public class DoctorsController {

	private final DoctorService doctorService;

	public DoctorsController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Doctor doctor) {
		return this.doctorService.add(doctor);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Doctor>> getAll(){
		return this.doctorService.getAll();
	}
	
	@GetMapping("/getById")
	public Doctor getById(@RequestParam int id) throws NotFoundException{
		return this.doctorService.getById(id);
	}
	
	@DeleteMapping("{id}")
	public Result delete(@PathVariable("id") int id) {
		return this.doctorService.delete(id);
	}
}
