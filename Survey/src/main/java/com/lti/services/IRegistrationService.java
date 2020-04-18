package com.lti.services;
import java.util.List;

import com.lti.models.Registration;

public interface IRegistrationService {
	public  List<Registration> findAllRegistration();
	
	
	public void addRegistration(Registration registration);
}
