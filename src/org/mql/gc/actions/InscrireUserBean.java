package org.mql.gc.actions;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.mql.gc.models.User;
import org.mql.gc.services.UserDaoService;

@ManagedBean
@RequestScoped
public class InscrireUserBean {
	
	private User utilisateur;
	private UserDaoService userDaoService;
	
	public InscrireUserBean() {
		utilisateur = new User();
		userDaoService = new UserDaoService(); 
	}
	
	public void inscrire() {
		System.out.println(utilisateur);
		userDaoService.create(utilisateur);//hanta haddi atadini l service li bdawro ayadini l dao li mnha l bd
		System.out.println(utilisateur);
	}

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
}
