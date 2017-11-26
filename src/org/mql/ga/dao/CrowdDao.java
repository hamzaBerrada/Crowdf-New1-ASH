package org.mql.ga.dao;

import org.hibernate.Session;
import org.mql.ga.models.Cas;
import org.mql.ga.models.User;

public class CrowdDao {
	private Session session;
	private Dao dao;
	public CrowdDao() {
	}
	// ha dao li mat2akad mna shiha 100% okay
	
	
	public void createUser(User user) {
		System.out.println("DAO");
		dao.openSession();// session tathal
		System.out.println("Open");
		session.beginTransaction();// transaction
		session.save(user);// ha lmohim
		System.out.println("Save");
		session.getTransaction().commit();// ha l commit
		dao.closeSession();// hanta bash t2akad ila hadashi khadam
	}

	public void insererCas(Cas cas) {
		System.out.println("DAO");
		dao.openSession();// session tathal
		System.out.println("Open");
		session.beginTransaction();// transaction
		session.save(cas);// ha lmohim
		System.out.println("Save");
		session.getTransaction().commit();// ha l commit
		dao.closeSession();// hanta bash t2akad ila hadashi khadam
	}
	
	
	
}
