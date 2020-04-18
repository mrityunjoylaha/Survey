package com.lti.services;

import java.util.List;

import com.lti.models.UserFeedbackDetails;

public interface IUserFeedbackDetailsService {
	
	public  List<UserFeedbackDetails> findAllDetails();
	
	
	public void addDetails(UserFeedbackDetails userFeedbackDetails);
}
