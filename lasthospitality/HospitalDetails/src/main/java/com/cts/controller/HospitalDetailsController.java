package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.HospitalDetails;
import com.cts.service.HospitalDetailsService;

@RestController
public class HospitalDetailsController {
	@Autowired
	HospitalDetailsService service;
	
	@GetMapping("/HospitalDetails")
	public List<HospitalDetails> getAlldetails() {
	    return service.getAlldetails();
	}
	
	@PostMapping("/HospitalDetails")
	public HospitalDetails createhospitadetails(@RequestBody HospitalDetails hospitalDetails) {
	    return service.createhospitadetails(hospitalDetails);
	}
}
