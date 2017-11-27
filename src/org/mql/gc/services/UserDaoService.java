package org.mql.gc.services;

import org.mql.gc.dao.ProjetDaoImp;
import org.mql.gc.models.User;

public class UserDaoService {
	private ProjetDaoImp userDao;
	
	public UserDaoService() {
		userDao = new ProjetDaoImp();
	}

	public UserDaoService(ProjetDaoImp userDao) {
		super();
		this.userDao = userDao;
	}
	
	public void create(User user) {
		System.out.println("service");
		userDao.createUser(user); 
	}
	
}
