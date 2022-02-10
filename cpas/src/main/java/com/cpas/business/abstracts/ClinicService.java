package com.cpas.business.abstracts;

import java.util.List;

import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.Result;
import com.cpas.domain.Clinic;

public interface ClinicService {
	DataResult<List<Clinic>>getAll();
	Result add(Clinic clinic);
}
