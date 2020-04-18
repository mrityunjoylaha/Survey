package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IUserFeedbackDetailsDao;
import com.lti.models.UserFeedbackDetails;

@Repository
public class UserFeedbackDetailsDaoImpl implements IUserFeedbackDetailsDao {
	
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<UserFeedbackDetails> readAllDetails() {
		String jpql = "SELECT u, r from UserFeedbackDetails u join Registration r on u.id = r.userId";
		//TypedQuery<UserFeedbackDetails> tquery = entityManager.createQuery(jpql, UserFeedbackDetails.class);
		Query tquery = entityManager.createQuery(jpql);
		
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createDetails(UserFeedbackDetails userFeedbackDetails) {
		entityManager.persist(userFeedbackDetails);
		
	}

}
