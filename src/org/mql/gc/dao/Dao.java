package org.mql.gc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao{
	private Session session;
	public Dao() {
		// TODO Auto-generated constructor stub
	}

	public void openSession() {
		System.out.println("DEBUT OPENNING SESSION");
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();//.configure("config/hibernate.cfg.xml")
		session = sessionFactory.openSession();// hna tanhal session ahah
		System.out.println("FIN OPENNING SESSION");
		
	}

	public void closeSession() {
		session.close();
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
