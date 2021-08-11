package com.gokulesh.DemoHb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args) {
		
		PersonName name = new PersonName();
		name.setFname("Gokulesh");
		name.setLname("K");
		name.setMname("A");
		Person person = new Person();
		person.setId(105);
		person.setName(name);
		person.setGender("male");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
	    
		Transaction tx = session.beginTransaction();
		
		
		
		 session.save(person);
		 tx.commit();
		
//		System.out.println(person);
	}

}
