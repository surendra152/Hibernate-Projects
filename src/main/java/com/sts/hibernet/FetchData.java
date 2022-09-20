package com.sts.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String args[])
	{
		//get ,load

		Configuration cf=new Configuration();
		cf.configure("hibernat.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		
		Session ss=factory.openSession();
		
		//get student -100
		 Student student=(Student)ss.get(Student.class, 101);
		System.out.println(student);
		
		Address ad=(Address)ss.get(Address.class, 12);
		System.out.println(ad.getStreet()+" "+ad.getCity());
		
		factory.close();
	}
}
