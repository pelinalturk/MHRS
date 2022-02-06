package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.DoctorService;

@RestController
@RequestMapping("/api/doctorsController")
public class DoctorsController {

	private final DoctorService doctorService;

	public DoctorsController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
}
