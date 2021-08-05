package com.Tutorials;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ConnectionProvider.DBConnectionProvider;
import com.Entity.User;

public class App {
	public static void main(String[] args) {

		DBConnectionProvider.getFactory();

		User user = new User();
		user.setUserName("Milan Kumar Singh");
		user.setUserPassword("Milan");
		user.setUserAddress("INDIA");

		Session session = DBConnectionProvider.getFactory().openSession();

		Transaction transaction = session.beginTransaction();

		session.save(user);

		transaction.commit();

		session.close();

		System.out.println("User Details :- " + user);

	}
}
