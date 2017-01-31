package com.man.dao;

import javax.persistence.Entity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.man.mapping.Test;

@Entity
public class TestDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Test getTestBean(int id){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Test.class);
		criteria.add(Restrictions.eq("id", id));
		Test t = (Test) criteria.list().get(0);
		return t;
	}
	
}
