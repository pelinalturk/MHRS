package com.cpas.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpas.business.abstracts.DistrictService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.domain.District;

@RestController
@RequestMapping("/api/ditrictsController/")
public class DistrictsController {
	
	private final DistrictService districtService;

	public DistrictsController(DistrictService districtService) {
		super();
		this.districtService = districtService;
	}
	
	@GetMapping("findByCityId")
	public DataResult<List<District>>findByCityId(@RequestParam int id){
		return this.districtService.findByCityId(id);
	}
}
