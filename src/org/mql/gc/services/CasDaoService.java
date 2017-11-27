package org.mql.gc.services;

import org.mql.gc.dao.ProjetDaoImp;
import org.mql.gc.models.Cas;

public class CasDaoService {
	private ProjetDaoImp casDao;
	public CasDaoService() {
		casDao=new ProjetDaoImp();
	}

	public CasDaoService(ProjetDaoImp casDao) {
		super();
		this.casDao = casDao;
	}
	
	public void create(Cas cas) {
		System.out.println("service");
		casDao.insererCas(cas); 
	}
	
}