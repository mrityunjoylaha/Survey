package com.lti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IRegistrationDao;
import com.lti.models.Registration;
import com.lti.services.IRegistrationService;

@Service("service")
public class RegistrationServiceImpl implements IRegistrationService{
	@Autowired
	private IRegistrationDao dao;
	
	@Override
	public List<Registration> findAllRegistration() {
		return dao.readAllRegistration();
	}

	@Override
	public void addRegistration(Registration registration) {
		dao.createRegistration(registration);
		
	}
}
