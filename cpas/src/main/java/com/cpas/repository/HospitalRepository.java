package com.cpas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	boolean existsByHospitalName(String hospitalName);
}
