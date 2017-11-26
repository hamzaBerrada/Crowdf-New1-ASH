package org.mql.ga.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao implements ProjetDao{
	private Session session;
	public Dao() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void openSession() {
		System.out.println("HHH");
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();//.configure("config/hibernate.cfg.xml")
		session = sessionFactory.openSession();// hna tanhal session ahah
		System.out.println("KKKKK");
	}
	@Override
	public void closeSession() {
		session.close();
	}

}
