package com.projects.ehealthcaresystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.projects.ehealthcaresystem.services.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	public DoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
}
