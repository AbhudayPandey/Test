package com.cts.service;

import java.util.List;

import com.cts.model.PatientDetails;

public interface IPatientService {
	public List<PatientDetails> getAlldetails();
	public PatientDetails createpatientdetails(PatientDetails patientDetails);
}
