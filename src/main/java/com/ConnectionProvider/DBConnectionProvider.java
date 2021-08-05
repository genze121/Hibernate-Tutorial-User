package com.ConnectionProvider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnectionProvider {

	private static SessionFactory sessionFactory = null;
	private static Configuration configuration = null;

	public static SessionFactory getFactory() {

		try {

			if (sessionFactory == null) {
				configuration = new Configuration();
				configuration.configure("hibernate.cfg.xml");

				sessionFactory = configuration.buildSessionFactory();

				System.out.println("Connection established successfully....");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sessionFactory;

	}

}
