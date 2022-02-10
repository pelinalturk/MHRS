package com.cpas.business.concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpas.business.abstracts.DistrictService;
import com.cpas.core.utilities.results.DataResult;
import com.cpas.core.utilities.results.ErrorDataResult;
import com.cpas.core.utilities.results.SuccessDataResult;
import com.cpas.domain.District;
import com.cpas.repository.DistrictRepository;

@Service
public class DistrictManager implements DistrictService{
	
	private final DistrictRepository districtRepository;

	public DistrictManager(DistrictRepository districtRepository) {
		super();
		this.districtRepository = districtRepository;
	}

	@Override
	public DataResult<List<District>> findByCityId(int id){
		if(!this.districtRepository.existsByCityId(id)) {return new ErrorDataResult<List<District>>(null, "City not found");}
		return new SuccessDataResult<List<District>>(this.districtRepository.findByCityId(id), "Data listed");
	}
}
