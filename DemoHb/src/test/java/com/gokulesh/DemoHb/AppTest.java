package com.gokulesh.DemoHb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
	    
		Transaction tx = session.beginTransaction();
		
		
		
		person = (Person) session.get(Person.class, 107);
		tx.commit();
		
		System.out.println(person);
	}

}
