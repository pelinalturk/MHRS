package com.cpas.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.GenderService;
import com.cpas.domain.Gender;

@RestController
@RequestMapping("/api/gendersController")
public class GendersController {

	private final GenderService genderService;

	public GendersController(GenderService genderService) {
		super();
		this.genderService = genderService;
	}
	
	@GetMapping("/getAll")
	public List<Gender>getAll(){
		return this.genderService.getAll();
	}
}
