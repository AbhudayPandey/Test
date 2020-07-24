package com.cts.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cts.model.SpecialistDetails;
@Service
public interface ISpecialistDetails {
	public List<SpecialistDetails> getAlldetails();
	public SpecialistDetails createspecilaistdetails(SpecialistDetails specialistDetails);
	
}
