package org.mql.ga.actions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.mql.ga.models.Cas;
import org.mql.ga.services.CasDaoService;

@ManagedBean
@RequestScoped
public class InsererCasBean {

	private Cas cas;
	private CasDaoService casDaoService;
	

	public InsererCasBean() {
		cas =new Cas();
		casDaoService = new CasDaoService();
	}
	
	public void insererCas() {
		casDaoService.create(cas);//hanta haddi atadini l service li bdawro ayadini l dao li mnha l bd
	}

	public Cas getCas() {
		return cas;
	}

	public void setCas(Cas cas) {
		this.cas = cas;
	}


	
}
