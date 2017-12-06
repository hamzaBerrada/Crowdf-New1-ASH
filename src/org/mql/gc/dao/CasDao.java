package org.mql.gc.dao;

import org.mql.gc.models.Cas;

public class CasDao {
	private Dao dao;
	public CasDao() {
		dao= new Dao();
	}
	// ha dao li mat2akad mna shiha 100% okay
	

	public void insererCas(Cas cas) {
		
		
		System.out.println(cas);
		System.out.println("DAO AVANT OUVERTURE SESSION");
		dao.openSession();// session tathal
		System.out.println("Open");
		dao.getSession().beginTransaction();// transaction
		dao.getSession().save(cas);// ha lmohim
		System.out.println("Save");
		dao.getSession().getTransaction().commit();// ha l commit
		dao.closeSession();// hanta bash t2akad ila hadashi khadam
	}
	
	
}
