package com.cpas.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.PatientService;
import com.cpas.core.ExceptionHandler.UserNotFoundException;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.core.utilities.results.SuccessDataResult;
import com.cpas.core.utilities.results.SuccessResult;
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
	public Result add(Patient patient) {
		this.patientRepository.save(patient);
		return new SuccessResult("User added.");
	}


	@Override
	public Result delete(int id) {
		this.patientRepository.deleteById(id);
		return new SuccessResult("User deleted.");
	}


	@Override
	public DataResult<List<Patient>> getAll() {
		return new SuccessDataResult<List<Patient>>(this.patientRepository.findAll(), "Data listed.");
	}


	@Override
	public Result update(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Patient getById(int id) throws UserNotFoundException {
		return this.patientRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
	}

	
}
