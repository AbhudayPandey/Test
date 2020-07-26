package com.cts.controller;

import java.util.List;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Hospital;
import com.cts.model.Patient;
import com.cts.model.Specialist;
import com.cts.service.HospitalService;
import com.cts.service.PatientService;
import com.cts.service.SpecialistService;

@RestController
public class HospitalFontDeskController {

	@Autowired
	SpecialistService service;
	
	@GetMapping("/Specialistdetails")
	public List<Specialist> getAlldetails() {
	    return service.getAlldetails();
	}
	
	@PostMapping("/Specialistdetails")
	public Specialist createspecilaistdetails(@RequestBody Specialist specialistDetails) {
	    return service.createspecilaistdetails(specialistDetails);
	}
	@Autowired
	PatientService patientservice;
	
	@GetMapping("/PatientDetails")
	public List<Patient> getpatientAlldetails() {
	    return patientservice.getAlldetails();
	}
	
	@PostMapping("/PatientDetails")
	public Patient createpatientdetails(@RequestBody Patient patientDetails) {
	    return patientservice.createpatientdetails(patientDetails);
	}
	@Autowired
	HospitalService hospitalservice;
	
	@GetMapping("/HospitalDetails")
	public List<Hospital> gethospitalAlldetails() {
	    return hospitalservice.getAlldetails();
	}
	
	@PostMapping("/HospitalDetails")
	public Hospital createhospitadetails(@RequestBody Hospital hospitalDetails) {
	    return hospitalservice.createhospitadetails(hospitalDetails);
	}
}
