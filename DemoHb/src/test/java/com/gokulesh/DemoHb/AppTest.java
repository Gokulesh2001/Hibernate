package com.gokulesh.DemoHb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		//
		Student s = new Student();
		s.setName("Gokul");
		s.setRollno(1);
		s.setMarks(70);
		s.getLaptops().add(laptop);
		
		laptop.getStudents().add(s);
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
	    
		Transaction tx = session.beginTransaction();
		
		
		
		 session.save(laptop);
		 session.save(s);
		 tx.commit();
		
//		System.out.println(person);
	}

}
