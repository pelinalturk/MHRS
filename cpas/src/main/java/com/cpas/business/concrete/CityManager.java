package com.cpas.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.CityService;
import com.cpas.domain.City;
import com.cpas.repository.CityRepository;

@Service
public class CityManager implements CityService{
	
	private final CityRepository cityRepository;

	public CityManager(CityRepository cityRepository) {
		super();
		this.cityRepository = cityRepository;
	}

	@Override
	public List<City> getAll() {
		return this.cityRepository.findAll();
	}
}
