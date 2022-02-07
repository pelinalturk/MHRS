package com.cpas.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cpas.adapter.abstracts.UserCheckService;
import com.cpas.business.abstracts.PatientService;
import com.cpas.core.ExceptionHandler.UserNotFoundException;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.ErrorResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.core.utilities.results.SuccessDataResult;
import com.cpas.core.utilities.results.SuccessResult;
import com.cpas.domain.Patient;
import com.cpas.repository.PatientRepository;

@Service
public class PatientManager implements PatientService{
	
	private final PatientRepository patientRepository;
	private final UserCheckService checkService;
	
	public PatientManager(PatientRepository patientRepository, @Qualifier("mernis") UserCheckService checkService) {
		super();
		this.patientRepository = patientRepository;
		this.checkService = checkService;
	}


	@Override
	public Result add(Patient patient) {
		if(this.patientRepository.existsByNationalId(patient.getNationalId())) {return new ErrorResult("User already exists");}
		if(!checkService.checkIfRealPerson(patient)) {return new ErrorResult("Not a valid person");}
		this.patientRepository.save(patient);
		return new SuccessResult("User added.");
	}


	@Override
	public Result delete(int id) {
		if(this.patientRepository.existsById(id)) {return new ErrorResult("User not found");}
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
