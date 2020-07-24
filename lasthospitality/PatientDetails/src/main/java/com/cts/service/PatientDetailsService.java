package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.PatientDetails;
import com.cts.repository.PatientDetailsRepository;

@Service
@Transactional
public class PatientDetailsService {
	@Autowired
	PatientDetailsRepository repository;
	
	public List<PatientDetails> getAlldetails(){
		return (List<PatientDetails>) repository.findAll();
	}
	
	public PatientDetails createpatientdetails(PatientDetails patientDetails) {
		return repository.save(patientDetails);
	}
}
