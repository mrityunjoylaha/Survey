package com.lti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IUserFeedbackDetailsDao;
import com.lti.models.UserFeedbackDetails;
import com.lti.services.IUserFeedbackDetailsService;

@Service("service1")
public class UserFeedbackDetailsServiceImpl implements IUserFeedbackDetailsService{

	@Autowired
	private IUserFeedbackDetailsDao dao;
	
	
	@Override
	public List<UserFeedbackDetails> findAllDetails() {
		return dao.readAllDetails();
	}

	@Override
	public void addDetails(UserFeedbackDetails userFeedbackDetails) {
		dao.createDetails(userFeedbackDetails);
		
	}

}
