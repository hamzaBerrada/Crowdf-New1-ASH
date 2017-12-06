package org.mql.gc.actions;

import java.io.IOException;
import java.io.InputStream;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.mql.gc.models.Cas;
import org.mql.gc.models.Photo;
import org.mql.gc.services.CasDaoService;

//@ManagedBean
public class InsererCasBean {
	private Cas cas;

	private CasDaoService casDaoService;

	private Photo photo;

	public InsererCasBean() {
		cas = new Cas();
		casDaoService = new CasDaoService();
	}

	public void insererCas() {
		casDaoService.create(cas);// hanta haddi atadini l service li bdawro ayadini l dao li mnha l bd
	}

	public void uploadFile1() {
		if (cas.getPdf1() != null) {
			try {
				InputStream inputStream = cas.getPdf1().getInputstream();
				System.out.println(cas);
				casDaoService.savePhoto(photo, inputStream, cas);
				//cas.setFileContent1(photo.getUri());
				System.out.println(cas);
				FacesMessage message = new FacesMessage("Succesful", cas.getPdf1().getFileName() + " is uploaded.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			} catch (IOException e) {
				e.printStackTrace();
				FacesMessage message = new FacesMessage("Not Succesful");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
		}
	}

	public Cas getCas() {
		return cas;
	}

	public void setCas(Cas cas) {
		this.cas = cas;
	}

}
