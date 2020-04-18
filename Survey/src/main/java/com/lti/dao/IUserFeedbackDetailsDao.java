package com.lti.dao;

import java.util.List;
import com.lti.models.UserFeedbackDetails;

public interface IUserFeedbackDetailsDao {
	public List<UserFeedbackDetails> readAllDetails();
	
	
	//Insert details
	public void createDetails(UserFeedbackDetails userFeedbackDetails);
}
