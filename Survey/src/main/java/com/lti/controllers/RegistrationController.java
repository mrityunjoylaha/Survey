package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.Registration;
import com.lti.services.IRegistrationService;

@RestController
@RequestMapping(path = "Registration")
@CrossOrigin
public class RegistrationController {
	@Autowired
	private IRegistrationService service;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Registration> viewAllAssembleData() {
		List<Registration> registration = service.findAllRegistration();
		System.out.println(registration);
		return registration;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addRegistration(@RequestBody Registration registration) {
		service.addRegistration(registration);
		
	}
}
