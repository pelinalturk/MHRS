package com.cpas.business.concrete;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.HospitalService;
import com.cpas.core.ExceptionHandler.UserNotFoundException;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.core.utilities.results.SuccessDataResult;
import com.cpas.core.utilities.results.SuccessResult;
import com.cpas.domain.Hospital;
import com.cpas.repository.HospitalRepository;

@Service
public class HospitalManager implements HospitalService{

	private final HospitalRepository hospitalRepository;
	
	public HospitalManager(HospitalRepository hospitalRepository) {
		super();
		this.hospitalRepository = hospitalRepository;
	}

	@Override
	public Result add(Hospital hospital) {
		this.hospitalRepository.save(hospital);
		return new SuccessResult("Data added");
	}

	@Override
	public Result delete(Hospital hospital) {
		hospital.setActive(false);
		return new SuccessResult("activity is disable");
	}

	@Override
	public Result update(Hospital hospital) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Hospital>> getAll() {
		return new SuccessDataResult<List<Hospital>>(this.hospitalRepository.findAll(), "Data listed");
	}

	@Override
	public Hospital getById(int id) throws NotFoundException {
		return this.hospitalRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Hospital not found"));
	}
	
}
