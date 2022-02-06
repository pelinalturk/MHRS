package com.cpas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer>{

}
