package com.cpas.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Name space can not be blank")
	@Column(name="name")
	private String name;
	
	@NotBlank(message = "Surname space can not be blank")
	@Column(name="surname")
	private String surname;
	
	@Size(min = 11, max = 11, message = "Turkish National Identity can not be less than 11 digits")
	@NotBlank(message = "Turkish National Identity space can not be blank")
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@Email
	@NotBlank(message = "Email space can not be blank")
	@Column(name="email")
	private String email;
	
	@NotBlank(message = "Password space can not be blank")
	@Column(name="password")
	private String password;
	
	@ManyToOne()
	@JoinColumn(name = "gender_id")
	private Gender gender;
	
	@Column(name="is_active")
	private boolean isActive = true;
	
	@JsonIgnore
	@Column(name="registration_date")
	private LocalDate registrationDate = LocalDate.now();
}