package com.cpas.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.GenderService;

@RestController
@RequestMapping("/api/gendersController")
public class GendersController {

	private final GenderService genderService;

	public GendersController(GenderService genderService) {
		super();
		this.genderService = genderService;
	}
	
}
