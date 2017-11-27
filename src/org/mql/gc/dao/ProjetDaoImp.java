package org.mql.gc.dao;

import org.hibernate.Session;
import org.mql.gc.models.Cas;
import org.mql.gc.models.User;

public class ProjetDaoImp {
	private Session session;
	private Dao dao;
	public ProjetDaoImp() {
		dao =new Dao();
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
		System.out.println("DAO AVANT OUVERTURE SESSION");
		dao.openSession();// session tathal
		System.out.println("Open");
		session.beginTransaction();// transaction
		session.save(cas);// ha lmohim
		System.out.println("Save");
		session.getTransaction().commit();// ha l commit
		dao.closeSession();// hanta bash t2akad ila hadashi khadam
	}
	
	
	
}
