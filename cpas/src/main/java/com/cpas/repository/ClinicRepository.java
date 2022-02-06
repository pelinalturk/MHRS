package com.cpas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer>{

}
