package org.mql.ga.services;

import org.mql.ga.dao.CrowdDao;
import org.mql.ga.models.Cas;

public class CasDaoService {
	private CrowdDao casDao;
	public CasDaoService() {
		casDao=new CrowdDao();
	}

	public CasDaoService(CrowdDao casDao) {
		super();
		this.casDao = casDao;
	}
	
	public void create(Cas cas) {
		System.out.println("service");
		casDao.insererCas(cas); 
	}
	
}