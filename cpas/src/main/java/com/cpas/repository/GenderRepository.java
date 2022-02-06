package com.cpas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpas.domain.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer>{

}
