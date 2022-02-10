package com.cpas.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.ClinicService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.ErrorResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.core.utilities.results.SuccessDataResult;
import com.cpas.core.utilities.results.SuccessResult;
import com.cpas.domain.Clinic;
import com.cpas.repository.ClinicRepository;

@Service
public class ClinicManager implements ClinicService{
	
	private final ClinicRepository clinicRepository;

	public ClinicManager(ClinicRepository clinicRepository) {
		super();
		this.clinicRepository = clinicRepository;
	}

	@Override
	public DataResult<List<Clinic>> getAll() {
		return new SuccessDataResult<List<Clinic>>(this.clinicRepository.findAll(), "Data listed");
	}

	@Override
	public Result add(Clinic clinic) {
		if(this.clinicRepository.existsByClinicName(clinic.getClinicName())) {return new ErrorResult("Clinic name already exist");}
		this.clinicRepository.save(clinic);
		return new SuccessResult("Data added");
	}
}
