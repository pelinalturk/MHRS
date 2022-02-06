package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.AppointmentService;

@RestController
@RequestMapping("/api/appointmentsController")
public class AppointmentsController {
	
	private final AppointmentService appointmentService;

	public AppointmentsController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}
}
