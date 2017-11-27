package org.mql.gc.actions;

import org.mql.gc.models.Cas;
import org.mql.gc.services.CasDaoService;

public class InsererCasBean {
	private Cas cas;
	private CasDaoService casDaoService;

	public InsererCasBean() {
		cas =new Cas();
		casDaoService = new CasDaoService();
	}
	
	public void insererCas() {
		System.out.println(cas);
		casDaoService.create(cas);//hanta haddi atadini l service li bdawro ayadini l dao li mnha l bd
		System.out.println(cas);
	}

	public Cas getCas() {
		return cas;
	}

	public void setCas(Cas cas) {
		this.cas = cas;
	}	
}
