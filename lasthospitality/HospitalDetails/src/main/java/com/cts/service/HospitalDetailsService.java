package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.HospitalDetails;
import com.cts.repository.HospitalDetailsRepository ;

@Service
@Transactional
public class HospitalDetailsService {
	@Autowired
	HospitalDetailsRepository  repository;
	
	public List<HospitalDetails> getAlldetails(){
		return (List<HospitalDetails>) repository.findAll();
	}
	
	public HospitalDetails createhospitadetails(HospitalDetails hospitalDetails) {
		return repository.save(hospitalDetails);
	}
}
