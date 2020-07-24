package com.cts.service;

import java.util.List;

import com.cts.model.HospitalDetails;

public interface IHospitalDetailsService {
	public List<HospitalDetails> getAlldetails();
	public HospitalDetails createhospitadetails(HospitalDetails hospitalDetails);
}
