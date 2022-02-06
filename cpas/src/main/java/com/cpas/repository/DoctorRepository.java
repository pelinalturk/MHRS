package com.cpas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
