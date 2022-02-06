package com.cpas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patients")
@PrimaryKeyJoinColumn(name = "id")
@Entity
public class Patient extends User{
	
	@NotBlank(message = "Mother name space can not be blank")
	@Column(name="mother_name")
	private String motherName;

	@NotBlank(message = "Father name space can not be blank")
	@Column(name="father_name")
	private String fatherName;
	
	@NotBlank(message = "Birth place space can not be blank")
	@Column(name="place_of_birth")
	private String placeOfBirth;
	
	@NotBlank(message = "Telephone space can not be blank")
	@Column(name="mobil_phone")
	private String mobilPhone;
}