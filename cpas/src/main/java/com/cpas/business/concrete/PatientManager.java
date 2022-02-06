package com.cpas.business.concrete;

import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.PatientService;
import com.cpas.domain.Patient;
import com.cpas.repository.PatientRepository;

@Service
public class PatientManager implements PatientService{
	
	private final PatientRepository patientRepository;
	
	public PatientManager(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}


	@Override
	public void add(Patient patient) {
		this.patientRepository.save(patient);
	}
	
}
