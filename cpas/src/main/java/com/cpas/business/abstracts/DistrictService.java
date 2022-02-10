package com.cpas.business.abstracts;

import java.util.List;


import com.cpas.core.utilities.results.DataResult;
import com.cpas.domain.District;

public interface DistrictService {
	DataResult<List<District>>findByCityId(int id);
}
