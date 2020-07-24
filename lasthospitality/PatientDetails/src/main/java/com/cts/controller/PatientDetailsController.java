package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.PatientDetails;
import com.cts.service.PatientDetailsService;

@RestController
public class PatientDetailsController {
	@Autowired
	PatientDetailsService service;
	
	@GetMapping("/PatientDetails")
	public List<PatientDetails> getAlldetails() {
	    return service.getAlldetails();
	}
	
	@PostMapping("/PatientDetails")
	public PatientDetails createpatientdetails(@RequestBody PatientDetails patientDetails) {
	    return service.createpatientdetails(patientDetails);
	}
}
