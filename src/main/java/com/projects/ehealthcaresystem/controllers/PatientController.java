package com.projects.ehealthcaresystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.projects.ehealthcaresystem.services.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
	
}
