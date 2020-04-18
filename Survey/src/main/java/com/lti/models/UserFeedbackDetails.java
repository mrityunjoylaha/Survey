package com.lti.models;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_feedback_details")
public class UserFeedbackDetails {
	@Id
	private int userFeedbackDetailsId;

//	@Temporal(TemporalType.DATE)
	private Date createdDate;

	private Time createdTime;

	private String isActive;

//	@Temporal(TemporalType.DATE)
	private Date updatedDate;

	private Time updatedTime;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	private Registration registration;

	public int getUserFeedbackDetailsId() {
		return userFeedbackDetailsId;
	}

	public void setUserFeedbackDetailsId(int userFeedbackDetailsId) {
		this.userFeedbackDetailsId = userFeedbackDetailsId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Time getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Time createdTime) {
		this.createdTime = createdTime;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Time getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Time updatedTime) {
		this.updatedTime = updatedTime;
	}

//	public Registration getRegistration() {
//		return registration;
//	}
//
//	public void setRegistration(Registration registration) {
//		this.registration = registration;
//	}

	public UserFeedbackDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserFeedbackDetails(int userFeedbackDetailsId, Date createdDate, Time createdTime, String isActive,
			Date updatedDate, Time updatedTime) {
		super();
		this.userFeedbackDetailsId = userFeedbackDetailsId;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.isActive = isActive;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
		//this.registration = registration;
	}

	@Override
	public String toString() {
		return "UserFeedbackDetails [userFeedbackDetailsId=" + userFeedbackDetailsId + ", createdDate=" + createdDate
				+ ", createdTime=" + createdTime + ", isActive=" + isActive + ", updatedDate=" + updatedDate
				+ ", updatedTime=" + updatedTime + "]";
	}

	
	
	
}
