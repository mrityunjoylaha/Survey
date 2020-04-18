package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.UserFeedbackDetails;
import com.lti.services.IUserFeedbackDetailsService;


@RestController
@RequestMapping(path = "UserFeedbackDetails")
@CrossOrigin
public class UserFeedbackDetailsController {
	
	@Autowired
	private IUserFeedbackDetailsService service1;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserFeedbackDetails> viewAllAssembleData() {
		List<UserFeedbackDetails> userFeedbackDetails = service1.findAllDetails();
		System.out.println(userFeedbackDetails);
		return userFeedbackDetails;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addDetails(@RequestBody UserFeedbackDetails userFeedbackDetails) {
		service1.addDetails(userFeedbackDetails);
		
	}
}
