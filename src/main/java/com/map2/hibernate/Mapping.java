package com.map2.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {
	
	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernat.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setId(23);
		e1.setName("Ram");
		
		e2.setId(35);
		e2.setName("Syam");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setId(56);
		p1.setName("ChatBot");
		
		p2.setId(57);
		p2.setName("Book system");
		
		List<Emp> list1=new ArrayList<Emp>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		//project set for e1
		e1.setProject(list2);
		p2.setEmps(list1);
		
		Session ss=factory.openSession();
		Transaction tr=ss.beginTransaction();
		
		ss.save(e1);
		ss.save(e2);
		ss.save(p1);
		ss.save(p2);
		
		tr.commit();
		factory.close();
	}
		
}
