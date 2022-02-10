package com.cpas.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.GenderService;
import com.cpas.domain.Gender;
import com.cpas.repository.GenderRepository;

@Service
public class GenderManager implements GenderService{
	
	private final GenderRepository genderRepository;

	public GenderManager(GenderRepository genderRepository) {
		super();
		this.genderRepository = genderRepository;
	}

	@Override
	public List<Gender> getAll() {
		return this.genderRepository.findAll();
	}
}
