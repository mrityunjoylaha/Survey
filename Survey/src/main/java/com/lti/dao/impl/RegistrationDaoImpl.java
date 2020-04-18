package com.lti.dao.impl;

import com.lti.dao.IRegistrationDao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.models.Registration;

@Repository
public class RegistrationDaoImpl implements IRegistrationDao{
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Registration> readAllRegistration() {
		String jpql = "SELECT u.userFeedbackDetailsId, r.fullName from UserFeedbackDetails u join Registration r on u.id = r.userId";
		//TypedQuery<Registration> tquery = entityManager.createQuery(jpql, Registration.class);
		Query tquery = entityManager.createQuery(jpql);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createRegistration(Registration registration) {
		entityManager.persist(registration);
	}
}
