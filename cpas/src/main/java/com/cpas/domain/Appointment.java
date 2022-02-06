package com.cpas.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointments")
@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@ManyToOne()
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	@ManyToOne()
	@JoinColumn(name = "hospital_id")
	private Hospital hospital;
	
	@ManyToOne()
	@JoinColumn(name = "clinic_id")
	private Clinic clinic;
	
	@Column(name="date_")
	private LocalDate date;
	
}