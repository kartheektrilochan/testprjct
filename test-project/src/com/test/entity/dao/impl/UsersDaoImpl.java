package com.test.entity.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.core.CommonDao;
import com.test.entity.User;

@Repository
@Transactional
public class UsersDaoImpl extends CommonDao<User> {

	public UsersDaoImpl() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	
	public User find(String userId)
	{
		super.beginTransaction();
		User user=super.find(userId);
		super.close();
		return user;
	}

	
}
