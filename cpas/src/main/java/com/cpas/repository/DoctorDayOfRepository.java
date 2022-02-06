package com.cpas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.DoctorDayOff;

@Repository
public interface DoctorDayOfRepository extends JpaRepository<DoctorDayOff, Integer>{

}
