package com.cpas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
