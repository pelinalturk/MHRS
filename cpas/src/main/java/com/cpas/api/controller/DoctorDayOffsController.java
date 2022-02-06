package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.DoctorDayOffService;

@RestController
@RequestMapping("/api/doctorDayOffsController/")
public class DoctorDayOffsController {

	private final DoctorDayOffService doctorDayOffService;

	public DoctorDayOffsController(DoctorDayOffService doctorDayOffService) {
		super();
		this.doctorDayOffService = doctorDayOffService;
	}
}
