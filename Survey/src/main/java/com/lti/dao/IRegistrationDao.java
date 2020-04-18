package com.lti.dao;
import java.util.List;

import com.lti.models.Registration;

public interface IRegistrationDao {
	//Select details
			public List<Registration> readAllRegistration();
			
			
			//Insert details
			public void createRegistration(Registration registration);
}
