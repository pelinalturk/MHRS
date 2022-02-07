package com.cpas.business.abstracts;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Doctor;

public interface DoctorService {
	Result add(Doctor doctor);
	Result delete (int id);
	Result update(Doctor doctor);
	DataResult<List<Doctor>>getAll();
	Doctor getById(int id) throws NotFoundException;
}
