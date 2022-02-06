package com.cpas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hospitals")
@Entity
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "City space can not be blank")
	@Column(name="city_name")
	private String city;
	
	@NotBlank(message = "District space can not be blank")
	@Column(name="district_name")
	private String district;
	
	@NotBlank(message = "Hospital space can not be blank")
	@Column(name="hospital_name")
	private String hospitalName;
	
	@NotBlank(message = "Address space can not be blank")
	@Column(name="address")
	private String address;
	
	@NotBlank(message = "Telephone space can not be blank")
	@Column(name="telephone")
	private String telephone;
	
	@NotBlank(message = "Email space can not be blank")
	@Column(name="email")
	private String email;
}