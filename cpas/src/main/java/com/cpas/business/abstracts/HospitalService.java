package com.cpas.business.abstracts;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Hospital;

public interface HospitalService {
	Result add(Hospital hospital);
	Result delete (Hospital hospital);
	Result update(Hospital hospital);
	DataResult<List<Hospital>>getAll();
	Hospital getById(int id) throws NotFoundException;
}
