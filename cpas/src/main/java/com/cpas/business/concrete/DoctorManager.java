package com.cpas.business.concrete;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.DoctorService;
import com.cpas.core.ExceptionHandler.UserNotFoundException;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.ErrorResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.core.utilities.results.SuccessDataResult;
import com.cpas.core.utilities.results.SuccessResult;
import com.cpas.domain.Doctor;
import com.cpas.repository.DoctorRepository;

@Service
public class DoctorManager implements DoctorService{

	private final DoctorRepository doctorRepository;
	
	public DoctorManager(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	@Override
	public Result add(Doctor doctor) {
		if(this.doctorRepository.existsByNationalId(doctor.getNationalId())) {return new ErrorResult("User already exists");}
		this.doctorRepository.save(doctor);
		return new SuccessResult("User added");
	}

	@Override
	public Result delete(int id) {
		if(this.doctorRepository.existsById(id)) {return new ErrorResult("User not found");}
		this.doctorRepository.deleteById(id);
		return new SuccessResult("User deleted");
	}

	@Override
	public Result update(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Doctor>> getAll(){
		return new SuccessDataResult<List<Doctor>>(this.doctorRepository.findAll(), "Data listed");
	}

	@Override
	public Doctor getById(int id) throws NotFoundException {
		return this.doctorRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
	}

}
