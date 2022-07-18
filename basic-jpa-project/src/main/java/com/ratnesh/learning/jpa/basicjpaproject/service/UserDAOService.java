package com.ratnesh.learning.jpa.basicjpaproject.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ratnesh.learning.jpa.basicjpaproject.entity.MyUser;

@Repository
@Transactional
public class UserDAOService {
		
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(MyUser user){
		entityManager.persist(user);
		return user.getId();
	}
}
