package com.cpas.business.abstracts;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Patient;

public interface PatientService {
	 Result add(Patient patient);
	 Result delete(int id);
	 Result update(Patient patient);
	 DataResult<List<Patient>> getAll();
	 Patient getById(int id) throws NotFoundException;
}
