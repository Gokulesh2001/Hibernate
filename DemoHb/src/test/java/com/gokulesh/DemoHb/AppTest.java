package com.gokulesh.DemoHb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args) {
		
		Person gokulesh = new Person();
		gokulesh.setId(101);
		gokulesh.setName("gokul");
		gokulesh.setGender("male");
		
		
		Configuration con = new Configuration();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		session.save(gokulesh);
	}

}
