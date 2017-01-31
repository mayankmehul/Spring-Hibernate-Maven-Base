package com.man.service;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.man.dao.TestDao;
import com.man.mapping.Test;

@Entity
public class TestService {

	@Autowired
	private TestDao testDao;
	
	public Test getTestBean(int id){
		return testDao.getTestBean(id);
	}
}
