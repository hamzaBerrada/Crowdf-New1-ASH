package org.mql.ga.services;

import org.mql.ga.dao.CrowdDao;
import org.mql.ga.models.User;

public class UserDaoService {
	private CrowdDao userDao;
	
	public UserDaoService() {
		userDao = new CrowdDao();
	}

	public UserDaoService(CrowdDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public void create(User user) {
		System.out.println("service");
		userDao.createUser(user); 
	}
	
}
