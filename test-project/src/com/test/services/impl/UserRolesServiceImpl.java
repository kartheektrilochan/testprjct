package com.test.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.core.CommonDao;
import com.test.entity.UserRole;
import com.test.rest.services.IUserRolesService;


@Service
@Transactional
public class UserRolesServiceImpl implements IUserRolesService {

@Autowired
private CommonDao<UserRole> commonDao;
	
	@Override
	public UserRole getUserRole(String userRoleId) {
		return commonDao.find(userRoleId);
	}

}
